package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082812 Positions of sign changes in running sum of mu(k)/k: n such that sign(Sum_{k=1..n} mu(k)/k) &lt;&gt; sign(Sum_{k=1..n+1} mu(k)/k).
 * @author Sean A. Irvine
 */
public class A082812 extends Sequence1 {

  private Q mSum = Q.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Q t = mSum;
      mSum = mSum.add(new Q(Functions.MOBIUS.l(++mN), mN));
      if (mSum.signum() != t.signum()) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
