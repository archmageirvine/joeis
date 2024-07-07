package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071250 extends A002113 {

  private Z mP = Z.ONE;
  private Z mDiff = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.subtract(mP).compareTo(mDiff) > 0) {
        mDiff = t.subtract(mP);
        mP = t;
        return t;
      }
    }
  }
}
