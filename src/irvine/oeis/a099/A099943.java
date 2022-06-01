package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099943 Number of 5 X n binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (01,1) and (11;0).
 * @author Sean A. Irvine
 */
public class A099943 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099943() {
    super(new long[] {-1, 2}, new long[] {72, 98});
  }
}
