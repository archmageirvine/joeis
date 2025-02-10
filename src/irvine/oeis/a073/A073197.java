package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073197 Permutation of natural numbers induced by the Catalan bijection gmA073197 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073197 extends A014486 {

  private SExpression s073197(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s073197(s.car());
    final SExpression s1 = A072796.s072796(s);
    s073197(s1.car());
    return A072797.s072797(s1);
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073197(SExpression.binexp2pars(super.next())).toZ());
  }
}

