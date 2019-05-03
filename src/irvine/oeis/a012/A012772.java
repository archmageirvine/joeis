package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012772 Take every 5th term of Padovan sequence <code>A000931</code>, beginning with the sixth term.
 * @author Sean A. Irvine
 */
public class A012772 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012772() {
    super(new long[] {1, -4, 5}, new long[] {1, 3, 12});
  }
}
