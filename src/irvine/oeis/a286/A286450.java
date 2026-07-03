package irvine.oeis.a286;
// manually 2026-07-01/rgs1 at 2026-07-01 20:55

import irvine.oeis.a252.A252750;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A286450 Restricted growth sequence computed for A252750.
 * @author Georg Fischer
 */
public class A286450 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A286450() {
    super(1, new A252750());
    next();
  }
}
