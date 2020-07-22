package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033903 Sort then <code>Add!</code>.
 * @author Sean A. Irvine
 */
public class A033903 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(27) : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
