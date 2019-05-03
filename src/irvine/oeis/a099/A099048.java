package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099048 Number of <code>5 X n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00;1), (01;0), (10;0)</code> and <code>(11;0)</code>.
 * @author Sean A. Irvine
 */
public class A099048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099048() {
    super(new long[] {-1, 2}, new long[] {32, 50});
  }
}
