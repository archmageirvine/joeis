package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072094 Permutation of natural numbers induced by the automorphism cdr_robr_cdr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A072094 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression cdrRobrCdr(final SExpression s) {
    if (s.isPair()) {
      if (!s.car().isPair()) {
        SExpression.swap(s);
      } else {
        s.setCdr(cdrRobrCdr(s.cdr()));
        SExpression.robr(s);
        s.setCdr(cdrRobrCdr(s.cdr()));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    final Z tree = cdrRobrCdr(s).toZ();
    return A057120.catalanGlobalRank(tree);
  }
}
