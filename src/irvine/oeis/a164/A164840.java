package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;

/**
 * A164840.
 * @author Sean A. Irvine
 */
public class A164840 implements Sequence {

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
      if (mValid.contains(s.substring(0, s.length() - 1))) {
        mValid.add(s);
        mLongest = s.length() + 1;
        return r;
      }
    }
  }
}

