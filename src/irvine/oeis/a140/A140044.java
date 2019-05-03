package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140044 Sequence generated from the <code>5/5Z</code> addition table considered as a matrix.
 * @author Sean A. Irvine
 */
public class A140044 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140044() {
    super(new long[] {1250, -125, -250, 25, 10}, new long[] {1, 20, 175, 2025, 19500});
  }
}
