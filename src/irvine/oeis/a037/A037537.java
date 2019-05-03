package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037537 <code>Base-4</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037537() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 25, 101});
  }
}
