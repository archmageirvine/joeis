package irvine.oeis.a140;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A140044 Sequence generated from the 5/5Z addition table considered as a matrix.
 * @author Sean A. Irvine
 */
public class A140044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140044() {
    super(1, new long[] {1250, -125, -250, 25, 10}, new long[] {1, 20, 175, 2025, 19500});
  }
}
