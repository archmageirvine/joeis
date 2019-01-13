package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094626.
 * @author Sean A. Irvine
 */
public class A094626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094626() {
    super(new long[] {-10, 10, 1}, new long[] {0, 1, 2});
  }
}
