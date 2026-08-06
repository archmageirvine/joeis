package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086202 Decimal expansion of Plouffe's b-constant.
 * @author Sean A. Irvine
 */
public class A086202 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086202() {
    super(0, new CR() {
      @Override
      protected Z approximate(final int precision) {
        return CR.PI.inverse().getApprox(precision).xor(CR.TAU.inverse().getApprox(precision));
      }
    });
  }
}
