package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076357 a(n) = floor(t^n) where t = 39661481813^(1/10) (approximately 11.4772).
 * @author Sean A. Irvine
 */
public class A076357 extends Sequence1 {

  private static final CR C = CR.valueOf(39661481813L).pow(new Q(1, 10));
  private long mN = 0;

  @Override
  public Z next() {
    return C.pow(++mN).floor();
  }
}
