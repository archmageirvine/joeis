package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088932.
 * @author Sean A. Irvine
 */
public class A088932 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088932() {
    super(new long[] {1, -2, 0, 2, -2, 2, 0, -2, 0, 2, 0, -2, 2, -2, 0, 2}, new long[] {1, 2, 4, 6, 10, 14, 20, 26, 36, 46, 60, 74, 94, 114, 140, 166});
  }
}
