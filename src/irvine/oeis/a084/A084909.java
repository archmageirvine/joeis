package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084909 Indices of Fibonacci numbers that satisfy: Sum_{k&gt;=1} 1/F(a(k)) = tau-1, where F(k) gives the k-th Fibonacci number with F(0)=1, such that the partial sums are nearest to, but never exceed, tau-1 = (sqrt(5)-1)/2.
 * @author Sean A. Irvine
 */
public class A084909 extends Sequence1 {

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
    return Z.valueOf(mN - 1);
  }
}
