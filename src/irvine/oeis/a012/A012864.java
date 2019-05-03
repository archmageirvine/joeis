package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012864 Take every 5th term of Padovan sequence <code>A000931</code>, beginning with the first term.
 * @author Sean A. Irvine
 */
public class A012864 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012864() {
    super(new long[] {1, -4, 5}, new long[] {1, 1, 3});
  }
}
