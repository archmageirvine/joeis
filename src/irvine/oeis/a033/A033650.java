package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033650 Trajectory of 7 under map x --&gt; x + (x-with-digits-reversed).
 * @author Sean A. Irvine
 */
public class A033650 extends Sequence0 {

  private Z mA = null;
  
  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.add(Functions.REVERSE.z(mA));
    return mA;
  }
}
