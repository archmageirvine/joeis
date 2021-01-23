package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005181 a(n) = ceiling(exp((n-1)/2)).
 * @author Sean A. Irvine
 */
public class A005181 implements Sequence {

  private long mN = -2;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.exp(CR.valueOf(new Q(++mN, 2))).ceil();
  }
}
