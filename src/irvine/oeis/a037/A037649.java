package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037649 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period <code>3,0,1</code>.
 * @author Sean A. Irvine
 */
public class A037649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037649() {
    super(new long[] {-7, 1, 0, 7}, new long[] {3, 21, 148, 1039});
  }
}
