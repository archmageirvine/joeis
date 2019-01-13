package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061927.
 * @author Sean A. Irvine
 */
public class A061927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061927() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 9, 42, 138, 363});
  }
}
