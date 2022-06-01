package irvine.oeis.a212;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A212565 Number of (w,x,y,z) with all terms in {1,...,n} and w+x&gt;=2y+2z.
 * @author Sean A. Irvine
 */
public class A212565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212565() {
    super(new long[] {1, -3, 1, 5, -5, -1, 3}, new long[] {0, 0, 1, 8, 28, 74, 159});
  }
}
