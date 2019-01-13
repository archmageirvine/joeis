package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057597.
 * @author Sean A. Irvine
 */
public class A057597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057597() {
    super(new long[] {1, -1, -1}, new long[] {0, 0, 1});
  }
}
