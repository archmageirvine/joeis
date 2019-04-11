package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003111;

/**
 * A006717 Number of ways of arranging <code>2n+1</code> nonattacking semi-queens on <code>a (2n+1)</code> X <code>(2n+1)</code> toroidal board.
 * @author Sean A. Irvine
 */
public class A006717 extends A003111 {

  @Override
  public Z next() {
    return super.next().multiply(mN);
  }
}
