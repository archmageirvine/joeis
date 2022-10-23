package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A018181 Powers of fifth root of 23 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A018181 extends Sequence0 {

  private static final CR ONE_FIFTH = CR.valueOf(new Q(1, 5));
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(23);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), ONE_FIFTH).round();
  }
}

