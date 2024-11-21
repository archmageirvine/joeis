package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073205 Permutation of natural numbers induced by the Catalan bijection gmA073205 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073205 extends A014486 {

  private SExpression s073205(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    final SExpression s1 = A072796.s072796(s);
    s1.setCdr(s073205(s1.cdr()));
    final SExpression s2 = A072797.s072797(s1);
    s073205(s2.car());
    return s2;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073205(SExpression.binexp2pars(super.next())).toZ());
  }
}

