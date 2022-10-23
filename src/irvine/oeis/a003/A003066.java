package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A003066 Problimes (first definition).
 * @author Sean A. Irvine
 */
public class A003066 extends Sequence1 {

  private Z mS = null;
  private Q mP = Q.ONE;

  @Override
  public Z next() {
    if (mS == null) {
      mS = Z.TWO;
    } else {
      mP = mP.multiply(new Q(mS, mS.subtract(1)));
      mS = mP.add(mS).toZ();
    }
    return mS;
  }
}
