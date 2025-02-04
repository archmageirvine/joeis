package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074923 Number of steps to reach the first integer starting with prime(n+1)/prime(n) and iterating the map x -&gt; x*ceiling(x), or -1 if no integer is ever reached.
 * @author Sean A. Irvine
 */
public class A074923 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    long e = 250;
    while (true) {
      Q x = new Q(mPrime.nextPrime(p), p);
      final Z mod = p.pow(e);
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
