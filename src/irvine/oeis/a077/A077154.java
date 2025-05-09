package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077154 Smallest k such that there are as many composite numbers less than n as there are between n and k.
 * @author Sean A. Irvine
 */
public class A077154 extends Sequence1 {

  private long mC = 0;
  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    long cnt = 0;
    while (cnt < mC) {
      if (!Predicates.PRIME.is(++k)) {
        ++cnt;
      }
    }
    if (mN > 1 && !Predicates.PRIME.is(mN)) {
      ++mC;
    }
    return Z.valueOf(k + 1);
  }
}

