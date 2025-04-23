package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076942 Smallest k &gt; 0 such that n*k+1 is a square.
 * @author Sean A. Irvine
 */
public class A076942 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z s = Z.ONE;
    while (true) {
      ++k;
      s = s.add(mN);
      if (Predicates.SQUARE.is(s)) {
        return Z.valueOf(k);
      }
    }
  }
}

