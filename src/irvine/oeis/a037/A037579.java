package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037579 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3</code>.
 * @author Sean A. Irvine
 */
public class A037579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037579() {
    super(new long[] {-7, 1, 7}, new long[] {1, 10, 71});
  }
}
