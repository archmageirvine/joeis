package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273180.
 * @author Sean A. Irvine
 */
public class A273180 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273180() {
    super(new long[] {-16, 0, 0, 17, 0, 0}, new long[] {1, 2, 6, 19, 38, 102});
  }
}
