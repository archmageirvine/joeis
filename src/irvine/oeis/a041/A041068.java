package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041068.
 * @author Sean A. Irvine
 */
public class A041068 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041068() {
    super(new long[] {1, 0, 0, 64, 0, 0}, new long[] {6, 13, 32, 397, 826, 2049});
  }
}
