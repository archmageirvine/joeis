package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A030052 Smallest number whose n-th power is a sum of distinct smaller n-th powers.
 * @author Sean A. Irvine
 */
public class A030052 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 0;

  private boolean search(final Z target, final Z prev, final boolean isSum) {
    for (Z k = prev.add(1), kp; (kp = k.pow(mN)).compareTo(target) <= 0; k = k.add(1)) {
      final Z remaining = target.subtract(kp);
      if (Z.ZERO.equals(remaining)) {
        return isSum;
      }
      if (remaining.compareTo(kp) > 0 && search(target.subtract(kp), k, true)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      final Z target = m.pow(mN);
      if (mVerbose) {
        StringUtils.message("Trying " + m + "^" + mN + " = " + target);
      }
      if (search(target, Z.ZERO, false)) {
        return m;
      }
    }
  }
}
