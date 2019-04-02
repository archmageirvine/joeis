package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037538 Base 5 digits are, in order, the first n terms of the periodic sequence with initial period 1,2,1.
 * @author Sean A. Irvine
 */
public class A037538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037538() {
    super(new long[] {-5, 1, 0, 5}, new long[] {1, 7, 36, 181});
  }
}
