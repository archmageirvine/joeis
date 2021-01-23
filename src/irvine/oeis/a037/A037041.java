package irvine.oeis.a037;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000224;

/**
 * A037041 Number of quadratic residues mod n for some n (A000224 sorted and duplicates removed).
 * @author Sean A. Irvine
 */
public class A037041 extends A000224 {

  private final TreeSet<Z> mOutput = new TreeSet<>();
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mLimit = 10;

  @Override
  public Z next() {
    mLimit += 10;
    while (mA.size() < mLimit) {
      final Z s = super.next();
      if (s.compareTo(mPrev) > 0) {
        mA.add(s);
      } else if (!mOutput.contains(s)) {
        throw new UnsupportedOperationException("Error detected: " + s + " should have been output earlier");
      }
    }
    mPrev = mA.pollFirst();
    mOutput.add(mPrev);
    return mPrev;
  }
}
