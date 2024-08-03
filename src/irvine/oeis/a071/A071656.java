package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A071655.
 * @author Sean A. Irvine
 */
public class A071656 extends Sequence0 {

  private final Sequence mA = new A014486();

  // (define (robl! s) (let ((ex-car (car s))) (set-car! s (cddr s)) (set-cdr! (cdr s) ex-car) (swap! (cdr s)) (swap! s) s))
  static SExpression robl(final SExpression s) {
    final SExpression exCar = s.car();
    s.setCar(s.cddr());
    s.setCdr(A071655.swap(s.cdr().setCdr(exCar)));
    A071655.swap(s);
    return s;
  }

  // (define (car_cdr_robl! s) (cond ((not (pair? s))) ((not (pair? (cdr s))) (swap! s)) (else (car_cdr_robl! (car s)) (car_cdr_robl! (cdr s)) (robl! s))) s)
  private SExpression carCdrRobl(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        A071655.swap(s);
      } else {
        carCdrRobl(s.car());
        s.setCdr(carCdrRobl(s.cdr()));
        robl(s);
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    return A057120.catalanGlobalRank(carCdrRobl(s).toZ());
  }
}
