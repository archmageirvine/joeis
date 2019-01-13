package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109437.
 * @author Sean A. Irvine
 */
public class A109437 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109437() {
    super(new long[] {-1, 3, 3}, new long[] {0, 1, 3});
  }
}
