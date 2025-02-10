package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073206 Permutation of natural numbers induced by the Catalan bijection gmA073206 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073206 extends A014486 {

  private SExpression s073206(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s073206(s.car());
    final SExpression s1 = A072797.s072797(s);
    s1.setCdr(s073206(s1.cdr()));
    return A072796.s072796(s1);
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073206(SExpression.binexp2pars(super.next())).toZ());
  }
}

