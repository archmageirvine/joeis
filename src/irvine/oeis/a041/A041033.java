package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041033.
 * @author Sean A. Irvine
 */
public class A041033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041033() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 110, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 5, 7, 12, 103, 115, 218, 551, 769, 1320});
  }
}
