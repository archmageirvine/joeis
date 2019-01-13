package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059986.
 * @author Sean A. Irvine
 */
public class A059986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059986() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 12, 54, 144});
  }
}
