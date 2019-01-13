package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247155.
 * @author Sean A. Irvine
 */
public class A247155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247155() {
    super(new long[] {1, -3, 3}, new long[] {32, 125, 280});
  }
}
