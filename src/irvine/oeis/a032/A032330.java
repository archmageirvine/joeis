package irvine.oeis.a032;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.ChjTransformSequence;

/**
 * A032330 "CHJ" (necklace, identity, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032330 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032330() {
    super(new PeriodicSequence(3));
  }
}
