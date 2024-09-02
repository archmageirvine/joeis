package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A071655 Permutation of natural numbers induced by the automorphism robr_car_cdr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A071655 extends Sequence0 {

  private final Sequence mA = new A014486();

  // (define (robr_car_cdr! s) (cond ((not (pair? s))) ((not (pair? (car s))) (swap! s)) (else (robr! s) (robr_car_cdr! (car s)) (robr_car_cdr! (cdr s)))) s)
  private SExpression robrCarCdr(final SExpression s) {
    if (s.isPair()) {
      if (!s.car().isPair()) {
        SExpression.swap(s);
      } else {
        SExpression.robr(s);
        robrCarCdr(s.car());
        s.setCdr(robrCarCdr(s.cdr())); // We need this set because of cdr() is not the original list
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    //System.out.println(s + " -> " + robrCarCdr(s.copy()));
    final Z tree = robrCarCdr(s).toZ();
    return A057120.catalanGlobalRank(tree);
  }
}
