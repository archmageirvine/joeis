package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001292 Concatenations of cyclic permutations of initial positive integers.
 * @author Sean A. Irvine
 */
public class A001292 implements Sequence {

  private long mN = 0;
  private long mS = 0;

  @Override
  public Z next() {
    if (mS >= mN) {
      ++mN;
      mS = 0;
    }
    final StringBuilder sb = new StringBuilder();
    ++mS;
    for (long k = 0, j = mS; k < mN; ++k, ++j) {
      sb.append(j);
      j %= mN;
    }
    return new Z(sb);
  }
}
