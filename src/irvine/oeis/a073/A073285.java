package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;

/**
 * A073285 Permutation of natural numbers induced by the Catalan bijection gma073285! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A073285 extends A014486 {

  private SExpression s073285(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s.setCdr(s073285(s.cdr()));
    final SExpression s1 = A072796.s072796(s);
    s073285(s1.car());
    return s1;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073285(SExpression.binexp2pars(super.next())).toZ());
  }
}

