package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391114 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A391114 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return (n & 1) == 0
      ? Z.ONE.shiftLeft(m).add(n - 2).divide(Z.ONE.shiftLeft(m))
      : Z.ONE.shiftLeft(m).multiply(m).add(1).multiply(n).add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM + 1, mM + 1);
  }
}
