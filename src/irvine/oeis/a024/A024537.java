package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024537.
 * @author Sean A. Irvine
 */
public class A024537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024537() {
    super(new long[] {-1, -1, 3}, new long[] {1, 2, 4});
  }
}
