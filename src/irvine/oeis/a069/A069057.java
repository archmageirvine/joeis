package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069057 Numbers k such that the numerator of Sum_{d|k} 1/d &gt; 2k.
 * @author Sean A. Irvine
 */
public class A069057 extends Sequence1 {

  private int mN = 34;

  @Override
  public Z next() {
    while (true) {
      final Z t = Rationals.SINGLETON.sumdiv(++mN, d -> new Q(1, d)).num();
      if (t.compareTo(2L * mN) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

