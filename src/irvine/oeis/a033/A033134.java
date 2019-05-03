package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033134 <code>Base-7</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,1,0.
 * @author Sean A. Irvine
 */
public class A033134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033134() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 8, 56, 393});
  }
}
