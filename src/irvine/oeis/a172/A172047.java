package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172047.
 * @author Sean A. Irvine
 */
public class A172047 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172047() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 25, 124, 380});
  }
}
