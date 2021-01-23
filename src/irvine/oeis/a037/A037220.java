package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037220 Summarize the previous term!.
 * @author Sean A. Irvine
 */
public class A037220 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : ZUtils.describe(ZUtils.digitCounts(mA));
    return mA;
  }
}
