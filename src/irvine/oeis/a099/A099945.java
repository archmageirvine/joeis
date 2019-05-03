package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099945 Number of <code>4 X n</code> binary matrices avoiding simultaneously the right angled numbered polyomino patterns <code>(ranpp) (00;1)</code> and <code>(11;0)</code>.
 * @author Sean A. Irvine
 */
public class A099945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099945() {
    super(new long[] {-2, 3}, new long[] {188, 404});
  }
}
