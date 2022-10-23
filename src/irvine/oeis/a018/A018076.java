package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018076 Powers of fourth root of 11 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A018076 extends Sequence0 {

  private static final CR QUARTER = CR.valueOf(new Q(1, 4));
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(11);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), QUARTER).round();
  }
}

