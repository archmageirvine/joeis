package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059973.
 * @author Sean A. Irvine
 */
public class A059973 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059973() {
    super(new long[] {1, 0, 4, 0}, new long[] {0, 1, 1, 2});
  }
}
