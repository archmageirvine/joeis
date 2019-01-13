package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133328.
 * @author Sean A. Irvine
 */
public class A133328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133328() {
    super(new long[] {1, -1, -39202, 39202, 1}, new long[] {0, 170, 13622, 6672192, 534017484});
  }
}
