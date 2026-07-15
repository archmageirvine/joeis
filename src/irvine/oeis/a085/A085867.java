package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A085867 Smallest nontrivial (not = 10^(n-1)) n-digit 7-smooth number. Or smallest n-digit number &gt; 10^(n-1) with prime divisors &lt; 10.
 * @author Sean A. Irvine
 */
public class A085867 extends A002473 {

  private Z mA = super.next();
  private Z mLim = null;

  @Override
  public Z next() {
    mLim = mLim == null ? Z.ONE : mLim.multiply(10);
    while (true) {
      if (mA.compareTo(mLim) > 0) {
        return mA;
      }
      mA = super.next();
    }
  }
}
