package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001128.
 * @author Sean A. Irvine
 */
public class A001128 implements Sequence {

  private Z mS = null;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
    } else {
      mS = mS.multiply(ZUtils.reverse(mS));
    }
    return mS;
  }
}

