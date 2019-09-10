package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025587 <code>'3x+1' record-setters</code> (blowup factor).
 * @author Sean A. Irvine
 */
public class A025587 implements Sequence {

  private Z mN = Z.ZERO;
  private Q mMax = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z max = mN;
      Z m = mN;
      while (!Z.ONE.equals(m)) {
        if (m.isEven()) {
          m = m.makeOdd();
        } else {
          m = m.multiply(3).add(1);
          if (m.compareTo(max) > 0) {
            max = m;
          }
        }
      }
      final Q blowup = new Q(max, mN);
      if (blowup.compareTo(mMax) > 0) {
        mMax = blowup;
        return mN;
      }
    }
  }
}
