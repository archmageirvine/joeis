package irvine.oeis.a374;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A374958 Median, as a function of n, of the probability mass function s(k-1,n-1)/k!, where k&gt;=n and s(a,b) denotes the unsigned Stirling number of the first kind.
 * @author Sean A. Irvine
 */
public class A374958 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long x = ++mN;
    Q sum = Q.ZERO;
    while (true) {
      sum = sum.add(new Q(Functions.STIRLING1.z(x - 1, mN - 1).abs(), Functions.FACTORIAL.z(x)));
      if (sum.compareTo(Q.HALF) >= 0) {
        return Z.valueOf(x);
      }
      ++x;
    }
  }
}
