package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037528 <code>Base-3</code> digits are, in order, the first n terms of the periodic sequence with initial period 1,1,2.
 * @author Sean A. Irvine
 */
public class A037528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037528() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 4, 14, 43});
  }
}
