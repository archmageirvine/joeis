package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066970 Integers of the form Sum_{i=1..m} phi(i)/gcd(m,i).
 * @author Sean A. Irvine
 */
public class A066970 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Q sum = Rationals.SINGLETON.sum(1, ++mN, k -> {
        return new Q(Functions.PHI.l((long) k), LongUtils.gcd(mN, k));
      });
      if (sum.isInteger()) {
        return sum.toZ();
      }
    }
  }
}
