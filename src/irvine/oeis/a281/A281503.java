package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281503.
 * @author Sean A. Irvine
 */
public class A281503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281503() {
    super(new long[] {-1, 0, 46, 0}, new long[] {1, 3, 43, 137});
  }
}
