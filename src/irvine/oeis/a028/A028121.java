package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028121.
 * @author Sean A. Irvine
 */
public class A028121 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028121() {
    super(new long[] {-1600, 1080, -262, 27}, new long[] {1, 27, 467, 6615});
  }
}
