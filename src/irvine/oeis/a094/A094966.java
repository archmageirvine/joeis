package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094966.
 * @author Sean A. Irvine
 */
public class A094966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094966() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 1, 1, 3});
  }
}
