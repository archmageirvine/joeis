package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A064151 Number of primes &lt; n^n.
 * @author Sean A. Irvine
 */
public class A064151 extends A000040 {

  private long mCount = 0;
  private long mN = 0;
  private Z mP = super.next();

  @Override
  public Z next() {
    final Z lim = Z.valueOf(++mN).pow(mN);
    while (mP.compareTo(lim) < 0) {
      mP = super.next();
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
