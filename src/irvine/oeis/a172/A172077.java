package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172077.
 * @author Sean A. Irvine
 */
public class A172077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172077() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 33, 168, 520});
  }
}
