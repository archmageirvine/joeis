package irvine.oeis.a032;

import irvine.oeis.BhjTransformSequence;
import irvine.oeis.a057.A057427;

/**
 * A032075 "BHJ" <code>(reversible</code>, identity, labeled) transform of 0,1,1,1...
 * @author Sean A. Irvine
 */
public class A032075 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032075() {
    super(new A057427());
  }
}
