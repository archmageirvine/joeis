package irvine.oeis.a387;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cc.LambertW;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387132 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A387132 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387132() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        return ComputableComplexField.SINGLETON.inverse(LambertW.lambertW(CC.NEG_ONE, 0, precision)).im().abs().getApprox(precision);
      }
    });
  }
}
