package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002262;
import irvine.oeis.a003.A003056;
import irvine.oeis.a014.A014486;
import irvine.oeis.a057.A057120;

/**
 * A072773 The upper triangular region of A072764.
 * @author Sean A. Irvine
 */
public class A072773 extends Sequence0 {

  private final DirectSequence mA003056 = new A003056();
  private final DirectSequence mA002262 = new A002262();
  private final DirectSequence mA014486 = DirectSequence.create(new A014486());
  private int mN = -1;

  private Z bijection(final Z x, final Z y) {
    return A057120.catalanGlobalRank(SExpression.createTree(SExpression.binexp2pars(mA014486.a(x)), SExpression.binexp2pars(mA014486.a(y))).toZ());
  }

  @Override
  public Z next() {
    return bijection(mA003056.a(++mN), mA002262.a(mN));
  }
}
