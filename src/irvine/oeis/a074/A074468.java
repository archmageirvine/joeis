package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074468 Least number m such that the Sigma-Harmonic sequence Sum_{k=1..m} 1/sigma(k) &gt;= n.
 * @author Sean A. Irvine
 */
public class A074468 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) < 0) {
      mSum = mSum.add(new Q(Z.ONE, Functions.SIGMA.z(++mM)));
    }
    return Z.valueOf(mM);
  }
}

