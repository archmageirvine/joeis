package irvine.oeis.a058;

import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058190 Number of increasing geometric progressions ending in n (in the positive integers), excluding those of length 1 or 2.
 * @author Sean A. Irvine
 */
public class A058190 implements Sequence {

  // After Antti Karttunen

  protected int mN = 0;

  private long endsMaxProgressionOfLength(Q n, final Q ratio) {
    long k = 1;
    while (true) {
      if (n.den().compareTo(Z.ONE) > 0) {
        return k;
      }
      n = n.multiply(ratio);
      ++k;
    }
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN - 1, d -> Z.valueOf(Long.max(0, endsMaxProgressionOfLength(new Q(d), new Q(d, mN)) - 2)));

  }
}
