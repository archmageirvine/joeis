package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001615 Dedekind psi function: n * Product_{p|n, p prime} (1 + 1/p).
 * @author Sean A. Irvine
 */
public class A001615 extends Sequence1 {

  private long mN = 0;

  /**
   * Dedekind psi function.
   * @param n number
   * @return <code>psi(n)</code>
   */
  public static Z dedekindPsi(final long n) {
    Z prod = Z.valueOf(n);
    for (final Z p : Jaguar.factor(n).toZArray()) {
      prod = prod.divide(p).multiply(p.add(1));
    }
    return prod;
  }

  @Override
  public Z next() {
    return dedekindPsi(++mN);
  }

}
