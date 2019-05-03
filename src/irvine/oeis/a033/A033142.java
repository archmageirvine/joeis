package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033142 <code>Base-6</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,0,0.
 * @author Sean A. Irvine
 */
public class A033142 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033142() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 6, 36, 217});
  }
}
