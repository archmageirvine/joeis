package irvine.oeis.a001;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001292 Concatenations of cyclic permutations of initial positive integers.
 * @author Sean A. Irvine
 */
public class A001292 implements Sequence {

  private final TreeSet<Z> mQ = new TreeSet<>();
  private long mN = 1;
  private long mS = 0;

  @Override
  public Z next() {
    if (mQ.isEmpty()) {
      while (mS < mN) {
        final StringBuilder sb = new StringBuilder();
        ++mS;
        for (long k = 0, j = mS; k < mN; ++k, ++j) {
          sb.append(j);
          j %= mN;
        }
        mQ.add(new Z(sb));
      }
      ++mN;
      mS = 0;
    }
    return mQ.pollFirst();
  }
}
