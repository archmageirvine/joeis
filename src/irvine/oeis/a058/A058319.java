package irvine.oeis.a058;

import irvine.oeis.PrependSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A058319 Coefficients (multiplied by 48) in Alternative Extended Simpson's rule for numerical integration.
 * @author Sean A. Irvine
 */
public class A058319 extends PrependSequence {

  // Could not find this equation in 2nd edition, sequence inferred from OEIS entry

  /** Construct the sequence. */
  public A058319() {
    super(new PeriodicSequence(48), 17, 59, 43, 49);
  }
}
