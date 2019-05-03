package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012814 Take every 5th term of Padovan sequence <code>A000931</code>, beginning with the third term.
 * @author Sean A. Irvine
 */
public class A012814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012814() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 5});
  }
}
