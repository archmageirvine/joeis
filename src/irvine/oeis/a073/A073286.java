package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A073284.
 * @author Sean A. Irvine
 */
public class A073286 extends A014486 {

  static SExpression s073286(final SExpression s) {
    return s.knick().exch();
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073286(SExpression.binexp2pars(super.next())).toZ());
  }
}

