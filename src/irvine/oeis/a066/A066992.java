package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066992 Integers of the form C(2n,n)^2 * Sum_{i=1..n} 1/phi(i).
 * @author Sean A. Irvine
 */
public class A066992 extends Sequence1 {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      mSum = mSum.add(new Q(Z.ONE, Functions.PHI.z(n)));
      final Q t = mSum.multiply(Binomial.binomial(2 * mN, mN).square());
      if (t.isInteger()) {
        return t.toZ();
      }
    }
  }
}

