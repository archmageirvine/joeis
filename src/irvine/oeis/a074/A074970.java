package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074970 Number of steps to reach the first integer starting with sigma(n)/n and iterating the map x -&gt; x*ceiling(x), or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A074970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long e = 250;
    while (true) {
      Q x = new Q(Functions.SIGMA1.z(mN), mN);
      final Z mod = Z.valueOf(mN).pow(e);
      long cnt = 0;
      while (cnt <= e - 3 && !x.isInteger()) {
        x = x.multiply(x.ceiling());
        x = new Q(x.num().mod(mod), x.den().mod(mod));
        ++cnt;
      }
      if (cnt < e - 3) {
        return Z.valueOf(cnt);
      }
      e *= 2;
    }
  }
}
