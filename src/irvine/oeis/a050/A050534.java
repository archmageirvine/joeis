package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050534.
 * @author Sean A. Irvine
 */
public class A050534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050534() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 3, 15});
  }
}
