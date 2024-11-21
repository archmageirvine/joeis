package irvine.oeis.a073;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a072.A072796;
import irvine.oeis.a072.A072797;

/**
 * A073194 Permutation of natural numbers induced by the Catalan bijection gmA073194 acting on the parenthesizations as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A073194 extends A014486 {

  private SExpression s073194(final SExpression s) {
    if (!s.isPair()) {
      return s;
    }
    final SExpression s1 = A072797.s072797(s);
    s073194(s1.car());
    final SExpression s3 = A072796.s072796(s1);
    s3.setCdr(s073194(s3.cdr()));
    return s3;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(s073194(SExpression.binexp2pars(super.next())).toZ());
  }
}

