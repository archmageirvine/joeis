package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053610 Number of positive squares needed to sum to n using the greedy algorithm.
 * @author Sean A. Irvine
 */
public class A053610 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long x = ++mN;
    long cnt = 0;
    while (x > 0) {
      final long s = LongUtils.sqrt(x);
      x -= s * s;
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
