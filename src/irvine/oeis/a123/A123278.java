package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123278.
 * @author Sean A. Irvine
 */
public class A123278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123278() {
    super(new long[] {-1, 108, -982, 108}, new long[] {0, 6, 500, 48114});
  }
}
