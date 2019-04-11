package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212336 Expansion of <code>1/(1-23*x+23*x^2-x^3)</code>.
 * @author Sean A. Irvine
 */
public class A212336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212336() {
    super(new long[] {1, -23, 23}, new long[] {1, 23, 506});
  }
}
