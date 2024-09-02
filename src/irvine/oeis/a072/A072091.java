package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072091 Permutation of natural numbers induced by the automorphism car_robl_cdr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A072091 extends Sequence0 {

  private final Sequence mA = new A014486();

  // (define (car_robl_cdr! s) (cond ((not (pair? s))) ((not (pair? (cdr s))) (swap! s)) (else (car_robl_cdr! (car s)) (robl! s) (car_robl_cdr! (cdr s)))) s)
  private SExpression carRoblCdr(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        SExpression.swap(s);
      } else {
        carRoblCdr(s.car());
        SExpression.robl(s);
        s.setCdr(carRoblCdr(s.cdr()));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    final Z tree = carRoblCdr(s).toZ();
    return A057120.catalanGlobalRank(tree);
  }
}
