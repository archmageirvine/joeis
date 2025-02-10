package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A073289 Permutation of natural numbers induced by the Catalan bijection gma073289! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A073289 extends A014486 {

  private SExpression s073289(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s.setCdr(s073289(s.cdr()));
    return A073287.s073287(s);
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073289(SExpression.binexp2pars(super.next())).toZ());
  }
}

