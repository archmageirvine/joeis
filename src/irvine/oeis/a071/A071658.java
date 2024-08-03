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
public class A071658 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression cdrRoblCar(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        A071655.swap(s);
      } else {
        s.setCdr(cdrRoblCar(s.cdr()));
        A071656.robl(s);
        cdrRoblCar(s.car());
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    return A057120.catalanGlobalRank(cdrRoblCar(s).toZ());
  }
}
