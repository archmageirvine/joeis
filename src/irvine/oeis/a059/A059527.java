package irvine.oeis.a059;

import irvine.math.cc.CC;
import irvine.math.cc.ComputableComplexField;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A059527 Decimal expansion of imaginary part of solution to z = log z.
 * @author Sean A. Irvine
 */
public class A059527 extends DecimalExpansionSequence {

  private static final ComputableComplexField CCF = ComputableComplexField.SINGLETON;

  private static final CR CONST = new CR() {

    // Maintain two versions and increase accuracy whenever a discrepancy is detected.
    private CC mA = CC.I;
    private CC mB = step(mA);

    private CC step(final CC z) {
      final CC t = CCF.divide(CCF.subtract(z, CCF.log(z)), CCF.subtract(CCF.one(), CCF.inverse(z)));
      return CCF.subtract(z, t);
    }

    @Override
    protected Z approximate(final int precision) {
      while (true) {
        final Z a = mA.im().getApprox(precision);
        final Z b = mB.im().getApprox(precision);
        if (a.equals(b)) {
          return a;
        }
        mA = mB;
        mB = step(mA);
      }
    }
  };

  /** Construct the sequence. */
  public A059527() {
    super(1, CONST);
  }
}
