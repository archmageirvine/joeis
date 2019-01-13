package irvine.oeis.a013;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A013631.
 * @author Sean A. Irvine
 */
public class A013631 extends ContinuedFractionSequence {

  // Warning: This will go wrong at some point -- limited accuracy
  // Good for at least 400 terms

  /** Construct the sequence. */
  public A013631() {
    super(new DecimalExpansionSequence() {

      private final CR mZeta = Zeta.zeta(3);

      @Override
      protected CR getCR() {
        return mZeta;
      }
    });
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
