package irvine.oeis.a069;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;
import irvine.oeis.a057.A057501;

/**
 * A069771 Self-inverse permutation of natural numbers induced by the automorphism RotateHandshakes180 acting on the parenthesizations encoded by A014486.
 * @author Sean A. Irvine
 */
public class A069771 extends Sequence0 {

  private final Sequence mA = new A014486();

  @Override
  public Z next() {
    SExpression s = SExpression.binexp2pars(mA.next());
    final int end = s.countParens() / 2;
    for (int k = 0; k < end; ++k) {
      s = A057501.rotateHandshakesP(s);
    }
    return A057120.catalanGlobalRank(s.toZ());
  }
}
