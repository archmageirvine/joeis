package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073208 Permutation of natural numbers induced by the Catalan bijection gmA073208 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073208 extends A014486 {

  private SExpression s073208(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    s.setCdr(s073208(s.cdr()));
    final SExpression s1 = A072797.s072797(s);
    s1.setCdr(s073208(s1.cdr()));
    return A072796.s072796(s1);
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073208(SExpression.binexp2pars(super.next())).toZ());
  }
}

