package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;

/**
 * A071657 Permutation of natural numbers induced by the automorphism car_robr_cdr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A071657 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression carRobrCdr(final SExpression s) {
    if (s.isPair()) {
      if (!s.car().isPair()) {
        SExpression.swap(s);
      } else {
        carRobrCdr(s.car());
        SExpression.robr(s);
        s.setCdr(carRobrCdr(s.cdr()));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    return Functions.GLOBAL_CATALAN_RANK.z(carRobrCdr(s).toZ());
  }
}
