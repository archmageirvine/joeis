package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057780.
 * @author Sean A. Irvine
 */
public class A057780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057780() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 3, 15, 24, 48});
  }
}
