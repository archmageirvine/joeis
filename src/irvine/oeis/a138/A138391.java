package irvine.oeis.a138;

import irvine.math.z.Z;

/**
 * A138391 Where record values occur in <code>A138385</code>.
 * @author Sean A. Irvine
 */
public class A138391 extends A138385 {

  private Z mBest = Z.NEG_ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = super.next();
      if (s.compareTo(mBest) > 0) {
        mBest = s;
        return Z.valueOf(mN);
      }
    }
  }
}
