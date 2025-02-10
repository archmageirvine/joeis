package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073196 Permutation of natural numbers induced by the Catalan bijection gmA073196 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073196 extends A014486 {

  private SExpression s073196(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    final SExpression s1 = A072797.s072797(s);
    s073196(s1.car());
    final SExpression s3 = A072796.s072796(s1);
    s073196(s3.car());
    return s3;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(s073196(SExpression.binexp2pars(super.next())).toZ());
  }
}

