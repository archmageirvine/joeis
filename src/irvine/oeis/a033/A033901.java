package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033901 Sort then Add!.
 * @author Sean A. Irvine
 */
public class A033901 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(21) : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
