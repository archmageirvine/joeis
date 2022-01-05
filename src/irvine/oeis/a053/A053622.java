package irvine.oeis.a053;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A053622 a(n) = round( n/log(n) - pi(n) ).
 * @author Sean A. Irvine
 */
public class A053622 extends A000720 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z pi = super.next();
    final CR n = CR.valueOf(mN);
    return n.divide(n.log()).round().subtract(pi);
  }
}
