package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A033653 Trajectory of 15 under map <code>x-&gt;x + (x-with-digits-reversed)</code>.
 * @author Sean A. Irvine
 */
public class A033653 implements Sequence {

  private Z mA = null;
  
  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(15) : mA.add(ZUtils.reverse(mA));
    return mA;
  }
}
