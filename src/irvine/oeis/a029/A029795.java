package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A029795 Numbers k such that k and k^3 have the same set of digits.
 * @author Sean A. Irvine
 */
public class A029795 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A029795(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A029795() {
    super(1);
  }

  private Z mN = Z.NEG_ONE;

  private static boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 ^ sn3[k] > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (isDigitMatch(mN)) {
        return mN;
      }
    }
  }
}
