package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073198 Permutation of natural numbers induced by the Catalan bijection gmA073198 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073198 extends A014486 {

  private SExpression s073198(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    final SExpression s1 = A072797.s072797(s);
    s1.setCdr(s073198(s1.cdr()));
    final SExpression s3 = A072796.s072796(s1);
    s3.setCdr(s073198(s3.cdr()));
    return s3;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073198(SExpression.binexp2pars(super.next())).toZ());
  }
}

