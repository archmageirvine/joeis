package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037552 Base 3 digits are, in order, the first n terms of the periodic sequence with initial period <code>2,1,1</code>.
 * @author Sean A. Irvine
 */
public class A037552 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037552() {
    super(new long[] {-3, 1, 0, 3}, new long[] {2, 7, 22, 68});
  }
}
