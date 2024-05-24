package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069819 Numbers k such that 1/(Sum_{p|k} (1/p) - 1), where p are the prime divisors of k, is a positive integer.
 * @author Sean A. Irvine
 */
public class A069819 extends Sequence1 {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      Q sum = Q.NEG_ONE;
      for (final Z p : Jaguar.factor(++mN).toZArray()) {
        sum = sum.add(new Q(1, p));
      }
      if (sum.num().equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
