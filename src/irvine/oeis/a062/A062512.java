package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062512 a(n) = floor( gamma(n/4) * gamma(n+1)/4 ).
 * @author Sean A. Irvine
 */
public class A062512 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(CR.FOUR).gamma().multiply(CR.valueOf(mN + 1).gamma()).divide(CR.FOUR).floor();
  }
}
