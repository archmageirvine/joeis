package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099048 Number of 5 X n 0-1 matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (01;0), (10;0) and (11;0).
 * @author Sean A. Irvine
 */
public class A099048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099048() {
    super(1, new long[] {-1, 2}, new long[] {32, 50});
  }
}
