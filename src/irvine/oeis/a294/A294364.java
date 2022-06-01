package irvine.oeis.a294;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A294364 Linear recurrence with signature (1,1,-1,1,1), where the first terms are powers of 2 (1,2,4,8,16).
 * @author Sean A. Irvine
 */
public class A294364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294364() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 2, 4, 8, 16});
  }
}
