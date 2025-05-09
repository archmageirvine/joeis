package irvine.oeis.a077;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077153 Smallest k such that there are n composite numbers greater than n and smaller than k.
 * @author Sean A. Irvine
 */
public class A077153 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    long cnt = 0;
    while (cnt < mN) {
      if (!Predicates.PRIME.is(++k)) {
        ++cnt;
      }
    }
    return Z.valueOf(k + 1);
  }
}

