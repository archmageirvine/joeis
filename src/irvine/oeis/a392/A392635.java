package irvine.oeis.a392;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A392635 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A392635 extends A002473 {

  private Q mBest = Q.ZERO;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      final Q ratio = new Q(t, mA);
      if (ratio.compareTo(mBest) > 0) {
        mBest = ratio;
        return t;
      }
    }
  }
}
