package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033112 Number of 9's when k is written in base b for all b and k satisfying 2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n.
 * @author Sean A. Irvine
 */
public class A033112 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033112() {
    super(1, new A033111());
  }
}
