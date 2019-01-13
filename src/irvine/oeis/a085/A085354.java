package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085354.
 * @author Sean A. Irvine
 */
public class A085354 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085354() {
    super(new long[] {16, -20, 8}, new long[] {1, 7, 36});
  }
}
