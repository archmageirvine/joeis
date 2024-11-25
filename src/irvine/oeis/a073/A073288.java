package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A073288 Permutation of natural numbers induced by the Catalan bijection gma073288! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A073288 extends A014486 {

  private SExpression s073288(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    final SExpression s1 = A073286.s073286(s);
    s1.setCdr(s073288(s1.cdr()));
    return s1;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073288(SExpression.binexp2pars(super.next())).toZ());
  }
}

