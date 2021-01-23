package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281064 Values of x such that x^2 = 5*y^2 + 11, where x and y are positive integers.
 * @author Sean A. Irvine
 */
public class A281064 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281064() {
    super(new long[] {-1, 0, 18, 0}, new long[] {4, 16, 56, 284});
  }
}
