package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028210.
 * @author Sean A. Irvine
 */
public class A028210 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028210() {
    super(new long[] {-4320, 2172, -404, 33}, new long[] {1, 33, 685, 11445});
  }
}
