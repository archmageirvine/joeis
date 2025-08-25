package irvine.oeis.a387;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cc.LambertW;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387131 Decimal expansion of the real part of the complex solutions to log(z) = -1/z on the principal branch of log(z).
 * @author Sean A. Irvine
 */
public class A387131 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387131() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        return ComputableComplexField.SINGLETON.inverse(LambertW.lambertW(CC.NEG_ONE, 0, precision)).re().getApprox(precision).negate();
      }
    });
  }
}
