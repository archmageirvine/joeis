package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001127 Trajectory of 1 under map x-&gt;x + (x-with-digits-reversed).
 * @author Sean A. Irvine
 */
public class A001127 extends Sequence0 {

  private Z mS = null;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.ONE;
    } else {
      mS = mS.add(Functions.REVERSE.z(mS));
    }
    return mS;
  }
}

