package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A029776 Digits of n appear in n^3.
 * @author Sean A. Irvine
 */
public class A029776 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A029776(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A029776() {
    super(1);
  }

  private Z mN = Z.NEG_ONE;

  protected boolean isDigitMatch(final Z n) {
    final int[] sn = ZUtils.digitCounts(n);
    final int[] sn3 = ZUtils.digitCounts(n.pow(3));
    for (int k = 0; k < sn.length; ++k) {
      if (sn[k] > 0 && sn3[k] == 0) {
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
