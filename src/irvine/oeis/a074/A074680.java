package irvine.oeis.a074;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A074680 Signature permutation of the seventeenth nonrecursive Catalan automorphism in table A089840. (Rotate binary tree right if possible, otherwise swap its sides.).
 * @author Sean A. Irvine
 */
public class A074680 extends A014486 {

  // aka gmrobr
  static SExpression rotateRightOrSwap(final SExpression s) {
    if (s.isPair()) {
      if (s.car().isPair()) {
        return SExpression.robr(s);
      } else {
        return s.exch();
      }
    }
    return s;
  }

  @Override
  public Z next() {
    return Functions.GLOBAL_CATALAN_RANK.z(rotateRightOrSwap(SExpression.binexp2pars(super.next())).toZ());
  }
}
