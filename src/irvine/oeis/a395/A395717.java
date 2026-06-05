package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395717 a(n) is the maximal number achievable by taking any sequence of positive integers less than or equal to n: s(1), s(2), s(3)... and generating a new sequence T with t(1) = s(1) and t(k+1) being the multiple of s(k+1) closest to t(k). In case there are two multiples of s(k+1) equally close, the sequence T is undefined. a(n) = maximal element of any sequence, T.
 * @author Sean A. Irvine
 */
public class A395717 extends Sequence1 {

  // After David A. Corneth

  private long mN = 0;

  private Z maxNext(final Z c, final long n) {
    Z res = Z.ZERO;
    //long bestI = 0;
    for (long i = 2; i <= n; ++i) {
      final Z minP = c.divide(i).multiply(i);
      final Z maxP = minP.add(i);
      if (maxP.subtract(c).compareTo(c.subtract(minP)) < 0) {
        if (maxP.compareTo(res) > 0) {
          res = maxP;
          //bestI = i;
        }
      }
    }
    return res;
  }

  @Override
  public Z next() {
    Z c = Z.valueOf(++mN);
    Z res = Z.ONE;
    while (c.signum() > 0) {
      res = c;
      c = maxNext(c, mN);
    }
    return res;
  }
}

