package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054078 Number of k&lt;=n such that a(k)&gt;n, where a is the permutation A054076 of N.
 * @author Sean A. Irvine
 */
public class A054078 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Sequence a = new A054076();
    for (long k = 0; k < mN; ++k) {
      if (a.next().longValueExact() > mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
