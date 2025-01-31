package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074838 Numbers m such that sum(d|m, 1/core(d) ) is an integer where core(x) is the squarefree part of x.
 * @author Sean A. Irvine
 */
public class A074838 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Rationals.SINGLETON.sumdiv(++mN, d -> new Q(Z.ONE, Functions.CORE.z(d))).isInteger()) {
        return Z.valueOf(mN);
      }
    }
  }
}
