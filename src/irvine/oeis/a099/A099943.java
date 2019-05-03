package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099943 Number of <code>5 X n</code> binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00;1), (01,1)</code> and <code>(11;0)</code>.
 * @author Sean A. Irvine
 */
public class A099943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099943() {
    super(new long[] {-1, 2}, new long[] {72, 98});
  }
}
