package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057227 Smallest member of smallest set S(n) of positive integers containing n which satisfies "k is in S, iff 2k-1 is in S, iff 4k is in S".
 * @author Sean A. Irvine
 */
public class A057227 extends Sequence1 {

  private long mN = 0;

  private long findMin(final long n) {
    if (n == 1) {
      return 1;
    }
    if ((n & 3) == 0) {
      return findMin(n / 4);
    }
    if ((n & 1) == 1) {
      return findMin((n + 1) / 2);
    }
    return n;
  }

  @Override
  public Z next() {
    return Z.valueOf(findMin(++mN));
  }
}
