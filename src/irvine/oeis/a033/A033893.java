package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A033893 Sort then Add!.
 * @author Sean A. Irvine
 */
public class A033893 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
