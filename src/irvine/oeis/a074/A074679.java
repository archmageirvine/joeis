package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A074679 Signature permutation of a Catalan automorphism: Rotate binary tree left if possible, otherwise swap its sides.
 * @author Sean A. Irvine
 */
public class A074679 extends A014486 {

  // aka gmrobl
  static SExpression rotateLeftOrSwap(final SExpression s) {
    if (s.isPair()) {
      if (s.cdr().isPair()) {
        return SExpression.robl(s);
      } else {
        return s.exch();
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return A057120.catalanGlobalRank(rotateLeftOrSwap(SExpression.binexp2pars(super.next())).toZ());
  }
}
