package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037505 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,0.
 * @author Sean A. Irvine
 */
public class A037505 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037505() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 6, 24, 97});
  }
}
