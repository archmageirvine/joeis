package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A071656 Permutation of natural numbers induced by the automorphism car_cdr_robl! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A071656 extends Sequence0 {

  private final Sequence mA = new A014486();

  // (define (car_cdr_robl! s) (cond ((not (pair? s))) ((not (pair? (cdr s))) (swap! s)) (else (car_cdr_robl! (car s)) (car_cdr_robl! (cdr s)) (robl! s))) s)
  private SExpression carCdrRobl(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        SExpression.swap(s);
      } else {
        carCdrRobl(s.car());
        s.setCdr(carCdrRobl(s.cdr()));
        SExpression.robl(s);
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
