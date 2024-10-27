package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002262;
import irvine.oeis.a014.A014486;
import irvine.oeis.a025.A025581;
import irvine.oeis.a057.A057120;

/**
 * A072764 Tabular N X N -&gt; N bijection induced by Lisp/Scheme function 'cons' combining the two planar binary trees/general trees/parenthesizations encoded by A014486(X) and A014486(Y).
 * @author Sean A. Irvine
 */
public class A072764 extends Sequence0 {

  private final DirectSequence mA025581 = new A025581();
  private final DirectSequence mA002262 = new A002262();
  private final DirectSequence mA014486 = DirectSequence.create(new A014486());
  private int mN = -2;

  private Z bijection(final Z x, final Z y) {
    return A057120.catalanGlobalRank(SExpression.createTree(SExpression.binexp2pars(mA014486.a(x)), SExpression.binexp2pars(mA014486.a(y))).toZ());
  }

  @Override
  public Z next() {
    return ++mN == -1 ? Z.ZERO : bijection(mA025581.a(mN), mA002262.a(mN));
  }
}
