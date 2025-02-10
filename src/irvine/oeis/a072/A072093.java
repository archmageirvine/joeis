package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;

/**
 * A072093 Permutation of natural numbers induced by the automorphism car_robl_car! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A072093 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression carRoblCar(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        SExpression.swap(s);
      } else {
        carRoblCar(s.car());
        SExpression.robl(s);
        carRoblCar(s.car());
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    final Z tree = carRoblCar(s).toZ();
    return Functions.GLOBAL_CATALAN_RANK.z(tree);
  }
}
