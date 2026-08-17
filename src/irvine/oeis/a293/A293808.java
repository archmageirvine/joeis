package irvine.oeis.a293;
// manually 2026-08-17/mtripol

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;
import irvine.oeis.triangle.DirectArray;

/**
 * A293808 Number T(n,k) of multisets of exactly k nonempty words with a total of n letters over n-ary alphabet such that within each prefix of a word every letter of the alphabet is at least as frequent as the subsequent alphabet letter; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;
 * @author Georg Fischer
 */
public class A293808 extends BaseTriangle implements DirectArray {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A293808() {
    super(0, 0, 0);
  }

  /* Maple:
     g:= proc(n) option remember; `if`(n<2, 1, g(n-1)+(n-1)*g(n-2)) end:  # A000085
     b:= proc(n, i) option remember; expand(`if`(n=0 or i=1, x^n,
           add(binomial(g(i)+j-1, j)*b(n-i*j, i-1)*x^j, j=0..n/i)))
         end:
     T:= n-> (p-> seq(coeff(p, x, i), i=0..n))(b(n$2)):
     seq(T(n), n=0..15);
  */
  final MemoryFunction1<Z> mG = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return n < 2 ? Z.ONE : get(n - 1).add(get(n - 2).multiply(n - 1));
    }
  };

  final MemoryFunctionInt2<Polynomial<Z>> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Polynomial<Z> compute(final int n, final int i) {
      return
        (n == 0 || i == 1) ? RING.shift(RING.one(), n) : RING.sum(0, n / i, j ->
          RING.multiply(get(n - i * j, i - 1), RING.multiply(RING.pow(RING.x(), j), Binomial.binomial(mG.get(i).add(j - 1), j))));
    }
  };

  @Override
  public Z triangleElement(final int n, final int k) {
    return mB.get(n, n).coeff(k);
  }

  @Override
  public Z a(final long n, final long k) {
    return triangleElement((int) n, (int) k);
  }
}
