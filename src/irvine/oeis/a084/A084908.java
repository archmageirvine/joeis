package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084908 Fibonacci numbers that satisfy: Sum_{k&gt;=1} 1/a(k) = 1, such that the partial sums are nearest to, but never exceed, unity.
 * @author Sean A. Irvine
 */
public class A084908 extends Sequence1 {

  private long mN = 2;
  private Q mS = Q.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mS.add(new Q(1, Functions.FIBONACCI.z(mN))).compareTo(Q.ONE) > 0) {
      ++mN;
    }
    mS = mS.add(new Q(1, Functions.FIBONACCI.z(mN)));
    return Functions.FIBONACCI.z(mN);
  }
}
