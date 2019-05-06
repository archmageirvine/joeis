package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014215 <code>[ sqrt(3/2)^n ]</code>.
 * @author Sean A. Irvine
 */
public class A014215 implements Sequence {

  private static final CR N = CR.valueOf(new Q(3, 2)).sqrt();
  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(N, ++mN).floor();
  }
}
