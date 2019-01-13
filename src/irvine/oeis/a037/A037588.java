package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037588.
 * @author Sean A. Irvine
 */
public class A037588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037588() {
    super(new long[] {-9, 1, 9}, new long[] {3, 28, 255});
  }
}
