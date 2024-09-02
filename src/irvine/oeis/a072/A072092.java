package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072092 Permutation of natural numbers induced by the automorphism car_robr_car! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A072092 extends Sequence0 {

  private final Sequence mA = new A014486();

  // (define (car_robr_car! s) (cond ((not (pair? s))) ((not (pair? (car s))) (swap! s)) (else (car_robr_car! (car s)) (robr! s) (car_robr_car! (car s)))) s)
  private SExpression carRobrCar(final SExpression s) {
    if (s.isPair()) {
      if (!s.car().isPair()) {
        SExpression.swap(s);
      } else {
        carRobrCar(s.car());
        SExpression.robr(s);
        carRobrCar(s.car());
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    final Z tree = carRobrCar(s).toZ();
    return A057120.catalanGlobalRank(tree);
  }
}
