package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033116 Base-6 digits are, in order, the first n terms of the periodic sequence with initial period 1,0.
 * @author Sean A. Irvine
 */
public class A033116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033116() {
    super(new long[] {-6, 1, 6}, new long[] {1, 6, 37});
  }
}
