package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069167 Numbers k such that k*Sum_{d|k} 1/phi(d) is an integer.
 * @author Sean A. Irvine
 */
public class A069167 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q s = Rationals.SINGLETON.sumdiv(++mN, d -> new Q(Z.ONE, Functions.PHI.z(d)));
      if (s.multiply(mN).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}

