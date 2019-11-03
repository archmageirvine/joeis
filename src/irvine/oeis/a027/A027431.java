package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a276.A276120;

/**
 * A027431 Continued fraction for <code>Pi^3/zeta(3)</code>.
 * @author Sean A. Irvine
 */
public class A027431 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A027431() {
    super(new A276120() {
      @Override
      protected CR getCR() {
        return super.getCR().inverse();
      }
    });
  }
}
