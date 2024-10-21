package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A072656.
 * @author Sean A. Irvine
 */
public class A072688 extends Sequence1 {

  private final Sequence mA = new A072685();
  private Z mP = mA.next();
  private Z mN = Z.ZERO;
  private Z mM = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mP)) {
      mM = mM.add(1);
      mP = mA.next();
    }
    return mM;
  }
}
