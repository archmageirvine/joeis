package irvine.oeis.a013;

import irvine.math.cr.Zeta;
import irvine.math.z.Z;
import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A013631 Continued fraction for zeta(3).
 * @author Sean A. Irvine
 */
public class A013631 extends ContinuedFractionSequence {

  // Warning: This will go wrong at some point -- limited accuracy
  // Good for at least 400 terms

  /** Construct the sequence. */
  public A013631() {
    super(0, new DecimalExpansionSequence(Zeta.zeta(3)));
  }

  @Override
  public Z next() {
    if (mN > 400) {
      throw new UnsupportedOperationException("Need more accuracy");
    }
    return super.next();
  }
}
