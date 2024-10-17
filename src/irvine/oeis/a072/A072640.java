package irvine.oeis.a072;

import irvine.lisp.SExpression;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000695;
import irvine.oeis.a014.A014486;
import irvine.oeis.a048.A048680;

/**
 * A072640 Maximum position in A072660 where the value n occurs.
 * @author Sean A. Irvine
 */
public class A072640 extends A014486 {

  private final DirectSequence mA000695 = new A000695();
  private final DirectSequence mA048680 = new A048680();
  private Z mTree = super.next();
  private int mN = -2;

  private Z f(final Z x, final Z y) {
    return mA048680.a(mA000695.a(x).add(mA000695.a(y).multiply2()));
  }

  private Z pack(final SExpression s) {
    return !s.isPair() ? Z.ZERO : f(pack(s.car()), pack(s.cdr())).add(1);
  }

  @Override
  public Z next() {
    mN += 2;
    Z max = Z.ZERO;
    while (Functions.DIGIT_LENGTH.i(2, mTree.add(1)) <= mN) {
      final Z t = pack(SExpression.binexp2pars(mTree));
      if (t.compareTo(max) > 0) {
        max = t;
      }
      mTree = super.next();
    }
    return max;
  }
}
