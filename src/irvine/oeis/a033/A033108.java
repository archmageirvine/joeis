package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033108 Number of <code>7</code>'s when k is written in base b for all b and k satisfying <code>2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A033108 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033108() {
    super(new A033107());
  }
}
