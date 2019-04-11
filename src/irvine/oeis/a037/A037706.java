package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037706 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,3,0,2</code>.
 * @author Sean A. Irvine
 */
public class A037706 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037706() {
    super(new long[] {-8, 1, 0, 0, 8}, new long[] {1, 11, 88, 706, 5649});
  }
}
