package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033117 Base 7 digits are, in order, the first n terms of the periodic sequence with initial period 1,0.
 * @author Sean A. Irvine
 */
public class A033117 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033117() {
    super(new long[] {-7, 1, 7}, new long[] {1, 7, 50});
  }
}
