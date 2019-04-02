package irvine.oeis.a006;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006844 a(1)=4, a(2)=5; thereafter a(n) is smallest number that is greater than a(n-1) and having a unique representation as a(j) + a(k) for j&lt;k.
 * @author Sean A. Irvine
 */
public class A006844 implements Sequence {

  private long mN = 3;
  private final HashSet<Long> mTerms = new HashSet<>();

  @Override
  public Z next() {
    if (mN == 3) {
      ++mN;
      mTerms.add(4L);
      return Z.FOUR;
    } else if (mN == 4) {
      ++mN;
      mTerms.add(5L);
      return Z.FIVE;
    }
    while (true) {
      ++mN; // safe since 6 is not a member
      final long h = (mN + 1) / 2;
      boolean seen = false;
      for (final long v : mTerms) {
        if (v < h && mTerms.contains(mN - v)) {
          if (seen) {
            seen = false;
            break;
          }
          seen = true;
        }
      }
      if (seen) {
        mTerms.add(mN);
        return Z.valueOf(mN);
      }
    }
  }
}
