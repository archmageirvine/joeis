package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091848.
 * @author Sean A. Irvine
 */
public class A091848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091848() {
    super(new long[] {1, -1, -1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 1, 1}, new long[] {0, 0, 0, 0, 0, 0, 1, 1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 15, 17, 18, 21, 22, 25, 26});
  }
}
