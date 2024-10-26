package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002262;
import irvine.oeis.a014.A014486;
import irvine.oeis.a025.A025581;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072768 extends Sequence1 {

  private final DirectSequence mA025581 = new A025581();
  private final DirectSequence mA002262 = new A002262();
  private final DirectSequence mA014486 = DirectSequence.create(new A014486());
  private int mN = -1;

  private Z bijection(final Z x, final Z y) {
    return Functions.DIGIT_LENGTH.z(2, SExpression.createTree(SExpression.binexp2pars(mA014486.a(x)), SExpression.binexp2pars(mA014486.a(y))).toZ()).divide2();
  }

  @Override
  public Z next() {
    return bijection(mA025581.a(++mN), mA002262.a(mN));
  }
}
