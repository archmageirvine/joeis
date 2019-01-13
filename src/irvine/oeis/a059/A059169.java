package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059169.
 * @author Sean A. Irvine
 */
public class A059169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059169() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 0, 1, 0, 1});
  }
}
