package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033135 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,1,0</code>.
 * @author Sean A. Irvine
 */
public class A033135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033135() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 9, 72, 577});
  }
}
