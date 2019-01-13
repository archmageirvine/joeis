package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179123.
 * @author Sean A. Irvine
 */
public class A179123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179123() {
    super(new long[] {1, -1, -8, 8, 1}, new long[] {5, 10, 14, 49, 80});
  }
}
