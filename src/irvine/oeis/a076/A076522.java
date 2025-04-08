package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076522 Floor( n*log_2(4*n/3) ).
 * @author Sean A. Irvine
 */
public class A076522 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(new Q(4 * ++mN, 3)).log().divide(CR.LOG2).multiply(mN).floor();
  }
}
