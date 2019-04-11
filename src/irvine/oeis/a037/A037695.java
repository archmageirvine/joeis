package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037695 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,3,0</code>.
 * @author Sean A. Irvine
 */
public class A037695 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037695() {
    super(new long[] {-4, 1, 0, 0, 4}, new long[] {1, 6, 27, 108, 433});
  }
}
