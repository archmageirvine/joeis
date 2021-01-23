package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033110 Number of 8's when k is written in base b for all b and k satisfying 2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A033110 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033110() {
    super(new A033109());
  }
}
