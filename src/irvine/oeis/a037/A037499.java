package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037499 Base-6 digits are, in order, the first n terms of the periodic sequence with initial period 1,0,2.
 * @author Sean A. Irvine
 */
public class A037499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037499() {
    super(new long[] {-6, 1, 0, 6}, new long[] {1, 6, 38, 229});
  }
}
