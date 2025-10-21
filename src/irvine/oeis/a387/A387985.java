package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387985 Decimal expansion of Sum_{k&gt;=1} (-1)^(k+1) * k*(zeta(2*k))^2 / 2^k.
 * @author Sean A. Irvine
 */
public class A387985 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387985() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        Z sum = Z.ZERO;
        int k = 0;
        while (true) {
          final Z t = Zeta.zeta(2 * ++k).square().multiply(k).getApprox(precision + k); // +k here does /2^k
          if (t.isZero()) {
            return sum;
          }
          sum = sum.signedAdd((k & 1) == 1, t);
        }
      }
    });
  }
}
