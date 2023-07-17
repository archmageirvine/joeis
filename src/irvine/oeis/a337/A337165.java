package irvine.oeis.a337;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction1;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A337165 Number T(n,k) of compositions of n into k nonzero squares; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A337165 extends Triangle {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A337165(final int offset) {
    super(offset);
  }

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);

  /** Construct the sequence. */
  public A337165() {
    super(1);
    hasRAM(true);
  }

  /* Maple:
    b:= proc(n) option remember; `if`(n=0, 1, add((s->
         `if`(s>n, 0, expand(x*b(n-s))))(j^2), j=1..isqrt(n)))
        end:
    T:= n-> (p-> seq(coeff(p, x, i), i=0..n))(b(n)):
    seq(T(n), n=0..14);
  */
  private final MemoryFunction1<Polynomial<Z>> mB = new MemoryFunction1<Polynomial<Z>>() {
    @Override
    protected Polynomial<Z> compute(final int n) {
      if (n == 0) {
        return RING.one();
      }
      Polynomial<Z> sum = RING.zero();
      final int jmax = IntegerUtils.sqrt(n);
      for (int j = 1; j <= jmax; ++j) {
        final int s = j * j;
        if (s <= n) {
          sum = RING.add(sum, RING.shift(get(n - s), 1));
        }
      }
      return sum;
    }
  };

  @Override
  public Z compute(final int n, final int k) {
    return mB.get(n).coeff(k);
  }
}
