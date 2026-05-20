package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084910 Fibonacci numbers that satisfy: Sum_{k&gt;=1} 1/a(k) = tau-1, such that the partial sums are nearest to, but never exceed, tau-1 = (sqrt(5)-1)/2.
 * @author Sean A. Irvine
 */
public class A084910 extends Sequence1 {

  private static final CR X = CR.FIVE.sqrt().subtract(1).divide(2);
  private long mN = 2;
  private CR mS = CR.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mS.add(new Q(1, Functions.FIBONACCI.z(mN))).compareTo(X) > 0) {
      ++mN;
    }
    mS = mS.add(new Q(1, Functions.FIBONACCI.z(mN)));
    return Functions.FIBONACCI.z(mN);
  }
}
