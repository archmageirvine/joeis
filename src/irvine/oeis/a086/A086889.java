package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A086889 Real part of Propp's cubic recurrence starting with i (i^2=-1).
 * @author Sean A. Irvine
 */
public class A086889 extends Sequence1 {

  private Zi mA = null;
  private Zi mB = null;
  private Zi mC = null;
  private Zi mD = null;

  protected Z select(final Zi n) {
    return n.re();
  }

  @Override
  public Z next() {
    if (mD == null) {
      if (mC == null) {
        if (mB == null) {
          if (mA == null) {
            mA = Zi.I;
            return select(Zi.I);
          }
          mB = Zi.I;
          return select(Zi.I);
        }
        mC = Zi.I;
        return select(Zi.I);
      }
      mD = Zi.I;
      return select(Zi.I);
    }
    final Zi t = mD.multiply(mC).multiply(mB).add(Zi.ONE).divide(mA);
    mA = mB;
    mB = mC;
    mC = mD;
    mD = t;
    return select(t);
  }
}
