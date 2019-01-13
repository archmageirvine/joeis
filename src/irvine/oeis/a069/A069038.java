package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069038.
 * @author Sean A. Irvine
 */
public class A069038 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069038() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 10, 51, 180, 501});
  }
}
