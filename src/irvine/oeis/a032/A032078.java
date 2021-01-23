package irvine.oeis.a032;

import irvine.oeis.BhjTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032078 "BHJ" (reversible, identity, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032078 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032078() {
    super(new PeriodicSequence(3));
  }
}
