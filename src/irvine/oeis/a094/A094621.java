package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094621.
 * @author Sean A. Irvine
 */
public class A094621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094621() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 11, 13, 141});
  }
}
