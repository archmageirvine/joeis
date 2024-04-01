package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069058 Numbers n such that A017666(n)=phi(n).
 * @author Sean A. Irvine
 */
public class A069058 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sumdiv(++mN, d -> new Q(1, d)).den().equals(Euler.phi((long) mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

