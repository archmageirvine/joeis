package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069165 a(n) are the integers corresponding to A069164(n).
 * @author Sean A. Irvine
 */
public class A069165 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q s = Rationals.SINGLETON.sumdiv(++mN, d -> new Q(Z.ONE, Functions.SIGMA0.z(d))).multiply(mN);
      if (s.isInteger()) {
        return s.toZ();
      }
    }
  }
}

