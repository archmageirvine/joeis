package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037541 Base 8 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037541 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037541() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 10, 81, 649});
  }
}
