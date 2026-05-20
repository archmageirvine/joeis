package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084907 Indices of Fibonacci numbers that satisfy: Sum_{k&gt;=1} 1/F(a(k)) = 1, where F(k) gives the k-th Fibonacci number with F(0)=1, such that the partial sums are nearest to, but never exceed, unity.
 * @author Sean A. Irvine
 */
public class A084907 extends Sequence1 {

  private long mN = 2;
  private Q mS = Q.ZERO;

  @Override
  public Z next() {
    ++mN;
    while (mS.add(new Q(1, Functions.FIBONACCI.z(mN))).compareTo(Q.ONE) > 0) {
      ++mN;
    }
    mS = mS.add(new Q(1, Functions.FIBONACCI.z(mN)));
    return Z.valueOf(mN - 1);
  }
}
