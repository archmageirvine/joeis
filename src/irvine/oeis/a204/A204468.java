package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204468.
 * @author Sean A. Irvine
 */
public class A204468 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204468() {
    super(new long[] {-1, 3, -3, 2, -3, 3}, new long[] {0, 1, 8, 33, 86, 177});
  }
}
