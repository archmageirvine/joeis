package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164849.
 * @author Sean A. Irvine
 */
public class A164849 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164849() {
    super(new long[] {-100, -100, 101, 1}, new long[] {1, 1, 101, 102});
  }
}
