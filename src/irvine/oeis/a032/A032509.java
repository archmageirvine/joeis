package irvine.oeis.a032;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032509 a(n) = round(tan(Pi*(1-1/n)/2)).
 * @author Sean A. Irvine
 */
public class A032509 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.tan(CR.HALF_PI.multiply(new Q(mN++, mN))).round();
  }
}
