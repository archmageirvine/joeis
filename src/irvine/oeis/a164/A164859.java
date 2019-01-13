package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A164859.
 * @author Sean A. Irvine
 */
public class A164859 implements Sequence {

  private Z mPrev = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN != 1) {
      final String n = Long.toString(mN, 2);
      final String p = mPrev.toString(2);
      while (true) {
        final String s = mPrev.toString(2);
        if (s.contains(p) && s.contains(n)) {
          break;
        }
        mPrev = mPrev.add(1);
      }
    }
    return mPrev;
  }
}

