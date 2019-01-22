package irvine.oeis.a018;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A018157.
 * @author Sean A. Irvine
 */
public class A018157 implements Sequence {

  private static final CR ONE_FIFTH = CR.valueOf(new Q(1, 5));
  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return ComputableReals.SINGLETON.pow(CR.valueOf(mN), ONE_FIFTH).add(CR.HALF).floor(32);
  }
}

