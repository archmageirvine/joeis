package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028204.
 * @author Sean A. Irvine
 */
public class A028204 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028204() {
    super(new long[] {-3780, 1968, -379, 32}, new long[] {1, 32, 645, 10480});
  }
}
