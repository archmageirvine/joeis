package irvine.oeis.a082;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.a000.A000695;
import irvine.oeis.a014.A014486;

/**
 * A082856 Recursive binary interleaving code for rooted plane binary trees, as ordered by A014486.
 * @author Sean A. Irvine
 */
public class A082856 extends A014486 {

  private final A000695 mA = new A000695();

  private Z binInterleave(final SExpression s) {
    return !s.isPair() ? Z.ZERO : mA.a(binInterleave(s.car())).multiply2().add(mA.a(binInterleave(s.cdr()))).multiply2().add(1);
  }

  @Override
  public Z next() {
    return binInterleave(SExpression.binexp2pars(super.next()));
  }
}
