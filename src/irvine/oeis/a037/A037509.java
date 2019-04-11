package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037509 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,2,0</code>.
 * @author Sean A. Irvine
 */
public class A037509 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037509() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 10, 80, 641});
  }
}
