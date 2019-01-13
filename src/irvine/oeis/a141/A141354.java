package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141354.
 * @author Sean A. Irvine
 */
public class A141354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141354() {
    super(new long[] {1, -2, 0, 2}, new long[] {1, -3, -7, -15});
  }
}
