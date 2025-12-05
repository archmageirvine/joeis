package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A082350 Permutation of natural numbers induced by the Catalan bijection gma082350 acting on the parenthesizations encoded by A014486/A063171.
 * @author Sean A. Irvine
 */
public class A082350 extends A014486 {

  private static SExpression s082350(SExpression s) {
    if (s.isPair()) {
      if (s.car().isPair()) {
        SExpression.robr(s);
      } else {
        s = s.knack();
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s082350(SExpression.binexp2pars(super.next())).toZ());
  }
}
