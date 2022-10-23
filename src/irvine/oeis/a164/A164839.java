package irvine.oeis.a164;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A164839 Left-truncatable squares: every suffix is square.
 * @author Sean A. Irvine
 */
public class A164839 extends Sequence1 {

  private final HashSet<String> mValid = new HashSet<>();
  {
    mValid.add("");
  }
  private long mN = 0;
  private int mLongest = 1;

  @Override
  public Z next() {
    while (true) {
      final Z r = Z.valueOf(++mN).square();
      final String s = r.toString();
      if (s.length() > mLongest) {
        return null;
      }
      if (mValid.contains(s.substring(1))) {
        mValid.add(s);
        mLongest = s.length() + 1;
        return r;
      }
    }
  }
}

