package irvine.oeis.a247;
// manually 2026-08-15/mtripol

import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A247255 Triangular array read by rows: T(n,k) is the number of weakly unimodal partitions of n in which the greatest part occurs exactly k times, n&gt;=1, 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A247255 extends BaseTriangle implements DirectArray {

  private int mN;
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A247255() {
    super(1, 1, 1);
    mN = 0;
  }

  /* Maple:
     b:= proc(n, i) option remember; local r; expand(
           `if`(i>n, 0, `if`(irem(n, i, 'r')=0, x^r, 0)+
           add(b(n-i*j, i+1)*(j+1), j=0..n/i)))
         end:
     T:= n-> (p-> seq(coeff(p, x, i), i=1..n))(b(n, 1)):
     seq(T(n), n=1..14);
  */
  final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      return
        (i > n) ? RING.zero() : RING.add(n % i == 0 ? RING.pow(Polynomial.create(0, 1), n / i) : RING.zero(),
          RING.sum(0, n / i, j -> RING.multiply(get(n - i * j, i + 1), Polynomial.create(j + 1))));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, 1).coeff(k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
