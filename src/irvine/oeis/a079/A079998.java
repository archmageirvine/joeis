package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079998 The characteristic function of the multiples of five.
 * @author Sean A. Irvine
 */
public class A079998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079998() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0});
  }
}
