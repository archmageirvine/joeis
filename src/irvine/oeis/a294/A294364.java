package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294364 Linear recurrence with signature <code>(1,1,-1,1,1)</code>, where the first terms are powers of <code>2 (1,2,4,8,16)</code>.
 * @author Sean A. Irvine
 */
public class A294364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294364() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 2, 4, 8, 16});
  }
}
