package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057703.
 * @author Sean A. Irvine
 */
public class A057703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057703() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 3, 7, 15, 31});
  }
}
