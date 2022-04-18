package irvine.oeis.a157;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A157694 Triangle read by rows: the Pascal triangle A007318 with all elements replaced by 1 which do not equal the central binomial coefficients.
 * @author Georg Fischer
 */
public class A157694 extends Triangle {

  /** Construct the sequence. */
  public A157694() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int m) {
    final Z cb = Binomial.binomial(n, n / 2);
    return Binomial.binomial(n, m).equals(cb) ? cb : Z.ONE;
  }
}
