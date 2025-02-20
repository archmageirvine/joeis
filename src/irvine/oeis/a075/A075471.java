package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075471 Rounded root-mean-square (RMS) value of first n primes.
 * @author Sean A. Irvine
 */
public class A075471 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().square());
    return CR.valueOf(new Q(mSum, ++mN)).sqrt().round();
  }
}
