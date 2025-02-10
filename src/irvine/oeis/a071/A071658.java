package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;

/**
 * A071658 Permutation of natural numbers induced by the automorphism cdr_robl_car! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A071658 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression cdrRoblCar(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        SExpression.swap(s);
      } else {
        s.setCdr(cdrRoblCar(s.cdr()));
        SExpression.robl(s);
        cdrRoblCar(s.car());
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    return Functions.GLOBAL_CATALAN_RANK.z(cdrRoblCar(s).toZ());
  }
}
