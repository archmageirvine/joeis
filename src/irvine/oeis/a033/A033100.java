package irvine.oeis.a033;

import irvine.oeis.PartialSumSequence;

/**
 * A033100 Number of <code>3</code>'s when k is written in base b for all b and k satisfying <code>2&lt;=b&lt;=n+1, 1&lt;=k&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A033100 extends PartialSumSequence {

  /** Construct a sequence. */
  public A033100() {
    super(new A033099());
  }
}
