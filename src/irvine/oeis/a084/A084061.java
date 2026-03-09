package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084061 Square number array read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A084061 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    final CR s = CR.valueOf(mN - mM).sqrt();
    return s.add(mM).pow(mM).add(CR.valueOf(mM).subtract(s).pow(mM)).divide(CR.TWO).round();
  }
}

