package irvine.oeis.a029;

import irvine.oeis.LinearRecurrence;

/**
 * A029826 Expansion of <code>1/(x^10+x^9-x^7-x^6-x^5-x^4-x^3+x+1) (inverse</code> of Salem <code>polynomial)</code>.
 * @author Sean A. Irvine
 */
public class A029826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A029826() {
    super(new long[] {-1, -1, 0, 1, 1, 1, 1, 1, 0, -1}, new long[] {1, -1, 1, 0, 0, 1, 0, 1, 0, 1});
  }
}
