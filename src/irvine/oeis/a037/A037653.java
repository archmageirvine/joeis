package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037653 Base 4 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037653() {
    super(new long[] {-4, 1, 0, 4}, new long[] {3, 12, 50, 203});
  }
}
