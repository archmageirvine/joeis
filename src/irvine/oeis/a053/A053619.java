package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A053619.
 * @author Sean A. Irvine
 */
public class A053619 extends A000720 {

  @Override
  public Z next() {
    final Z pi = super.next();
    final CR n = CR.valueOf(mN);
    return n.divide(n.log().subtract(CR.ONE)).round().subtract(pi);
  }
}
