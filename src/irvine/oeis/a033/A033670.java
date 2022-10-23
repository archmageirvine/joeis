package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A033670 Trajectory of 89 under map x-&gt;x + (x-with-digits-reversed).
 * @author Sean A. Irvine
 */
public class A033670 extends Sequence0 {

  private Z mA = null;
  
  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(89) : mA.add(ZUtils.reverse(mA));
    return mA;
  }
}
