package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033100 Number of 3's when k is written in base b for all b and k satisfying 2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A033100 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033100() {
    super(new A033099());
  }
}
