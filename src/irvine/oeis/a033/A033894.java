package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033894 Sort then <code>Add!</code>.
 * @author Sean A. Irvine
 */
public class A033894 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.add(ZUtils.sortDigitsAscending(mA));
    return mA;
  }
}
