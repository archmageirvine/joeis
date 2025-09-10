package irvine.oeis.a080;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080221 n is Harshad (divisible by the sum of its digits) in a(n) bases from 1 to n.
 * @author Sean A. Irvine
 */
public class A080221 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    for (long b = 2; b <= mN; ++b) {
      if (Predicates.HARSHAD.is(b, mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

