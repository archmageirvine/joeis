package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A033907 Sort then Add!.
 * @author Sean A. Irvine
 */
public class A033907 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(32) : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
