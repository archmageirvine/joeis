package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071294 Number of witnesses for strong pseudoprimality of 2n+1, i.e., number of bases b, 1 &lt;= b &lt;= 2n, in which 2n+1 is a strong pseudoprime.
 * @author Sean A. Irvine
 */
public class A071294 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    final Z n = Z.valueOf(mN);
    long cnt = 0;
    for (long b = 1; b < mN; ++b) {
      if (Predicates.STRONG_PSEUDOPRIME.is(b, n)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
