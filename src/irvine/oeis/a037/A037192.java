package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037192 Summarize the previous term!.
 * @author Sean A. Irvine
 */
public class A037192 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(8899) : ZUtils.describe(ZUtils.digitCounts(mA));
    return mA;
  }
}
