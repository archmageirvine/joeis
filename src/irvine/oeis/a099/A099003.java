package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099003 Number of 4 X n 0-1 matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (10;0) and (11;0).
 * @author Sean A. Irvine
 */
public class A099003 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099003() {
    super(new long[] {-2, 3}, new long[] {1, 16});
  }
}
