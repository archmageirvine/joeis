package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161549.
 * @author Sean A. Irvine
 */
public class A161549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161549() {
    super(new long[] {1, -3, 3}, new long[] {1, 17, 37});
  }
}
