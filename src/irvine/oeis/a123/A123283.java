package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123283.
 * @author Sean A. Irvine
 */
public class A123283 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123283() {
    super(new long[] {-1, 108, -982, 108}, new long[] {0, 12, 1000, 96228});
  }
}
