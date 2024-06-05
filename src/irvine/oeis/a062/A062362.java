package irvine.oeis.a062;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062362 a(n) = floor of Sum_{ d divides n } phi(d)/d.
 * @author Sean A. Irvine
 */
public class A062362 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Rationals.SINGLETON.sumdiv(mN, d -> {
      return new Q(Functions.PHI.l(d), d);
    }).toZ();
  }
}
