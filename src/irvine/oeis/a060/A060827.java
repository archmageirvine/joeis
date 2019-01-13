package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060827.
 * @author Sean A. Irvine
 */
public class A060827 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060827() {
    super(new long[] {-1, 0, 1, 0, 2, 0}, new long[] {2, 2, 2, 4, 6, 10});
  }
}
