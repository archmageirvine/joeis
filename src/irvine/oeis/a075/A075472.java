package irvine.oeis.a075;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a001.A001597;

/**
 * A075472 Rounded root-mean-square (RMS) value of first n perfect powers.
 * @author Sean A. Irvine
 */
public class A075472 extends A001597 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mSum = mSum.add(super.next().square());
    return CR.valueOf(new Q(mSum, ++mN)).sqrt().round();
  }
}
