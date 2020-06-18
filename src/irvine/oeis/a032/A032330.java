package irvine.oeis.a032;

import irvine.oeis.ChjTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A032330 "CHJ" <code>(necklace</code>, identity, labeled) transform of 3,3,3,3...
 * @author Sean A. Irvine
 */
public class A032330 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032330() {
    super(new PeriodicSequence(3));
  }
}
