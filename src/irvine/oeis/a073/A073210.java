package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073210 Permutation of natural numbers induced by the Catalan bijection gmA073210 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073210 extends A014486 {

  private SExpression s073210(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s073210(s.car());
    final SExpression s1 = A072797.s072797(s);
    s073210(s1.car());
    return A072796.s072796(s1);
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073210(SExpression.binexp2pars(super.next())).toZ());
  }
}

