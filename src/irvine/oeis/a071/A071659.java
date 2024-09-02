package irvine.oeis.a071;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A071659 Permutation of natural numbers induced by the automorphism car_cdr_robr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A071659 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression carCdrRobr(final SExpression s) {
    if (s.isPair()) {
      if (!s.car().isPair()) {
        SExpression.swap(s);
      } else {
        carCdrRobr(s.car());
        s.setCdr(carCdrRobr(s.cdr()));
        SExpression.robr(s);
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    return A057120.catalanGlobalRank(carCdrRobr(s).toZ());
  }
}
