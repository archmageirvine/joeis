package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046731 a(n) = sum of primes &lt; 10^n.
 * @author Sean A. Irvine
 */
public class A046731 extends A000040 {

  private Z mLim = Z.ONE;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSum;
      final Z p = super.next();
      mSum = mSum.add(p);
      if (p.compareTo(mLim) >= 0) {
        mLim = mLim.multiply(10);
        return t;
      }
    }
  }
}
