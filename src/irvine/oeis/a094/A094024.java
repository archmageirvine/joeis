package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094024.
 * @author Sean A. Irvine
 */
public class A094024 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094024() {
    super(new long[] {2, 2, -1}, new long[] {1, 1, 1});
  }
}
