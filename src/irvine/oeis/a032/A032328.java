package irvine.oeis.a032;

import irvine.oeis.transform.ChjTransformSequence;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A032328 "CHJ" (necklace, identity, labeled) transform of 2,2,2,2...
 * @author Sean A. Irvine
 */
public class A032328 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032328() {
    super(new PeriodicSequence(2));
  }
}
