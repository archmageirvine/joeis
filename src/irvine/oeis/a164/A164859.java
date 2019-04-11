package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A164859 <code>a(1)=1</code>. <code>a(n) =</code> the smallest positive integer that, when written in binary, contains both binary <code>a(n-1)</code> and binary n as (possibly overlapping) substrings.
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

