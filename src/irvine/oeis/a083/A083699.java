package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A083699 Numerators of the continued fraction convergents which have the least possible prime denominators (A072999).
 * @author Sean A. Irvine
 */
public class A083699 extends Sequence1 {

  private final Sequence mS = new A083698().skip(3);
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return mA;
      }
      mB = Z.ONE;
      return mB;
    }
    final Z t = mB.multiply(mS.next()).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
