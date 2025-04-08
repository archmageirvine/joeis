package irvine.oeis.a076;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A076521 Floor( (n/2)*log_2(2*n/3) ).
 * @author Sean A. Irvine
 */
public class A076521 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(new Q(2 * ++mN, 3)).log().divide(CR.LOG2).multiply(mN).divide(2).floor();
  }
}
