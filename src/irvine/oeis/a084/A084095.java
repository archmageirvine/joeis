package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084095 First superdiagonal of number array A084061.
 * @author Sean A. Irvine
 */
public class A084095 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final CR s = CR.valueOf(mN - 1).sqrt();
    return s.add(mN).pow(mN).add(CR.valueOf(mN).subtract(s).pow(mN)).divide(CR.TWO).round();
  }
}

