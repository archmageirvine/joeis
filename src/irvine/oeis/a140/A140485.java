package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A140485 Trajectory of 1 under repeated application of the map: n -&gt; n + second-smallest number that does not divide n.
 * @author Sean A. Irvine
 */
public class A140485 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    long k = 1;
    int cnt = 0;
    while (true) {
      if (mA.mod(++k) != 0 && ++cnt == 2) {
        mA = mA.add(k);
        return mA;
      }
    }
  }
}
