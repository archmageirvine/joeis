package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033115 <code>Base-5</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,0.
 * @author Sean A. Irvine
 */
public class A033115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033115() {
    super(new long[] {-5, 1, 5}, new long[] {1, 5, 26});
  }
}
