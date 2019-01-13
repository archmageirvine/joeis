package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244881.
 * @author Sean A. Irvine
 */
public class A244881 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244881() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 34, 353, 2037, 8272, 26585, 72302, 173502});
  }
}
