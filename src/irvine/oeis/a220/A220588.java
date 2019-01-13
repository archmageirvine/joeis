package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220588.
 * @author Sean A. Irvine
 */
public class A220588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220588() {
    super(new long[] {-2, 7, -9, 5}, new long[] {1, 0, -2, -4});
  }
}
