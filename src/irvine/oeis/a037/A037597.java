package irvine.oeis.a037;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A037597 Base-4 digits are, in order, the first n terms of the periodic sequence with initial period 1,3,0.
 * @author Sean A. Irvine
 */
public class A037597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037597() {
    super(1, new long[] {-4, 1, 0, 4}, new long[] {1, 7, 28, 113});
  }
}
