package irvine.oeis.a032;

import irvine.oeis.a000.A000012;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032073 "BHJ" (reversible, identity, labeled) transform of 1,1,1,1...
 * @author Sean A. Irvine
 */
public class A032073 extends BhjTransformSequence {

  /** Construct the sequence. */
  public A032073() {
    super(new A000012());
  }
}
