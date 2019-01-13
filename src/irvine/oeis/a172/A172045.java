package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172045.
 * @author Sean A. Irvine
 */
public class A172045 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172045() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 17, 80, 240});
  }
}
