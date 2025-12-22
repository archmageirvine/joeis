package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082750 Triangle read by rows, in which the n-th row contains n smallest numbers not occurring earlier such that the concatenation of terms of a row yields a prime.
 * @author Sean A. Irvine
 */
public class A082750 extends Sequence1 {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 1;
  private String mS = "";
  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    if (++mM >= mN) {
      // Special case for row 1, so we can assume odd k for all other rows
      mM = 0;
      if (mN++ == 1) {
        mUsed.add(2L);
        return Z.TWO;
      }
      // Complete the row
      long k = mLeastUnused | 1; // ensure odd
      while (true) {
        if (!mUsed.contains(k) && new Z(mS + k).isProbablePrime()) {
          mUsed.add(k);
          mS = "";
          return Z.valueOf(k);
        }
        k += 2; // k will always be odd for n > 1
      }
    }
    mUsed.add(mLeastUnused);
    mS = mS + mLeastUnused;
    return Z.valueOf(mLeastUnused);
  }
}
