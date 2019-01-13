package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152750.
 * @author Sean A. Irvine
 */
public class A152750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152750() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 48});
  }
}
