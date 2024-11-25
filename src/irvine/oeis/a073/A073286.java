package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A073286 Permutation of natural numbers induced by the composition of the Catalan bijections A069770 &amp; A069767.
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

