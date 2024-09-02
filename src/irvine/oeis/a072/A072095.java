package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072095 Permutation of natural numbers induced by the automorphism cdr_robl_cdr! acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A072095 extends Sequence0 {

  private final Sequence mA = new A014486();

  private SExpression cdrRoblCdr(final SExpression s) {
    if (s.isPair()) {
      if (!s.cdr().isPair()) {
        SExpression.swap(s);
      } else {
        s.setCdr(cdrRoblCdr(s.cdr()));
        SExpression.robl(s);
        s.setCdr(cdrRoblCdr(s.cdr()));
      }
    }
    return s;
  }

  @Override
  public Z next() {
    final SExpression s = SExpression.binexp2pars(mA.next());
    final Z tree = cdrRoblCdr(s).toZ();
    return A057120.catalanGlobalRank(tree);
  }
}
