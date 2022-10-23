package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003067 Problimes (second definition).
 * @author Sean A. Irvine
 */
public class A003067 extends Sequence1 {

  private Z mS = null;
  private Q mP = Q.ONE;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
    } else {
      mP = mP.multiply(new Q(mS, mS.subtract(1)));
      mS = mP.add(Q.HALF).add(mS).toZ();
    }
    return mS;
  }
}
