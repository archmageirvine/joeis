package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099003 Number of <code>4 X n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns <code>(ranpp) (00;1), (10;0)</code> and <code>(11;0)</code>.
 * @author Sean A. Irvine
 */
public class A099003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099003() {
    super(new long[] {-2, 3}, new long[] {1, 16});
  }
}
