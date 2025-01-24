package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074469 Least m such that Sigma-Composite-Harmonic series Sum_{k=1..m} 1/A000203(A002808(k)) &gt;= n.
 * @author Sean A. Irvine
 */
public class A074469 extends A002808 {

  private Q mSum = Q.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    final Q n = Q.valueOf(++mN);
    while (mSum.compareTo(n) < 0) {
      ++mM;
      mSum = mSum.add(new Q(Z.ONE, Functions.SIGMA.z(super.next())));
    }
    return Z.valueOf(mM);
  }
}

