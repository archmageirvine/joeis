package irvine.oeis.a003;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003066 Problimes <code>(first definition)</code>.
 * @author Sean A. Irvine
 */
public class A003066 implements Sequence {

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
