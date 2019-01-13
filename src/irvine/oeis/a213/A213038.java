package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213038.
 * @author Sean A. Irvine
 */
public class A213038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213038() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 1, 6, 4});
  }
}
