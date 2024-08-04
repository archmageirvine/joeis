package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A071701 Number of twin prime pairs &lt;= n of form (4*k+1,4*k+3), k&gt;0.
 * @author Sean A. Irvine
 */
public class A071701 extends Sequence1 {

  private final Sequence mA = new A071695();
  private Z mM = Z.ZERO;
  private Z mN = Z.ZERO;
  private Z mP = mA.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mP)) {
      mP = mA.next();
      mM = mM.add(1);
    }
    return mM;
  }
}
