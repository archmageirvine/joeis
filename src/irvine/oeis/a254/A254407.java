package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254407.
 * @author Sean A. Irvine
 */
public class A254407 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254407() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 7, 32, 86});
  }
}
