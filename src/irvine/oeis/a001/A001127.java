package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001127.
 * @author Sean A. Irvine
 */
public class A001127 implements Sequence {

  private Z mS = null;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.ONE;
    } else {
      mS = mS.add(ZUtils.reverse(mS));
    }
    return mS;
  }
}

