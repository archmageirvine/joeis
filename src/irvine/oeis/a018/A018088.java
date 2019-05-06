package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018088 Powers of fourth root of 15 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A018088 implements Sequence {

  private static final CR QUARTER = CR.valueOf(new Q(1, 4));
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), QUARTER).round();
  }
}

