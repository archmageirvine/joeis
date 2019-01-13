package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037778.
 * @author Sean A. Irvine
 */
public class A037778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037778() {
    super(new long[] {-10, 11, -11, 11}, new long[] {3, 31, 310, 3102});
  }
}
