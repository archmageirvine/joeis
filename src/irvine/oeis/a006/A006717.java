package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003111;

/**
 * A006717 Number of ways of arranging 2n+1 nonattacking semi-queens on a (2n+1) X (2n+1) toroidal board.
 * @author Sean A. Irvine
 */
public class A006717 extends A003111 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
