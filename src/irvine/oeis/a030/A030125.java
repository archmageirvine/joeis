package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a002.A002065;

/**
 * A030125 Decimal expansion of Lehmer's constant.
 * @author Sean A. Irvine
 */
public class A030125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A030125() {
    super(ComputableReals.SINGLETON.cot(new CR() {
      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        final A002065 b = new A002065();
        boolean sign = true;
        Z sum = CR.HALF_PI.getApprox(precision);
        b.next(); // skip 0
        while (true) {
          sign = !sign;
          final Z t = ComputableReals.SINGLETON.atan(CR.valueOf(b.next()).inverse()).getApprox(precision);
          if (t.isZero()) {
            break;
          }
          sum = sum.signedAdd(sign, t);
        }
        return sum;
      }
    }));
  }
}
