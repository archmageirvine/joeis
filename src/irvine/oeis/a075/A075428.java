package irvine.oeis.a075;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075428 Number of steps to reach the first integer (= A075429(n)) starting with 1 + 2/(n*(n+1)) and iterating the map x -&gt; x*ceiling(x), or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A075428 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long e = 250;
    while (true) {
      Q x = Q.ONE.add(new Q(2, mN * (mN + 1)));
      final Z mod = Z.valueOf(mN * (mN + 1) / 2).pow(e);
      long cnt = 0;
      while (cnt <= e && !x.isInteger()) {
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
