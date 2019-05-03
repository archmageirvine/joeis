package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099944 Number of <code>3 X n</code> binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00;1)</code> and <code>(11;0)</code>.
 * @author Sean A. Irvine
 */
public class A099944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099944() {
    super(new long[] {-2, 3}, new long[] {76, 164});
  }
}
