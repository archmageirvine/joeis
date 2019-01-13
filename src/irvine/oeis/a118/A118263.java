package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118263.
 * @author Sean A. Irvine
 */
public class A118263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118263() {
    super(new long[] {24, 0, 0, -26, 0, 0, 9, 0, 0}, new long[] {1, 1, 1, 2, 3, 4, 4, 9, 16});
  }
}
