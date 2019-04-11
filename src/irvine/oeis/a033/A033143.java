package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033143 Base-7 digits are, in order, the first n terms of the periodic sequence with initial period <code>1,0,0</code>.
 * @author Sean A. Irvine
 */
public class A033143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033143() {
    super(new long[] {-7, 1, 0, 7}, new long[] {1, 7, 49, 344});
  }
}
