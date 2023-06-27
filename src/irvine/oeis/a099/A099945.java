package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099945 Number of 4 X n binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1) and (11;0).
 * @author Sean A. Irvine
 */
public class A099945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099945() {
    super(3, new long[] {-2, 3}, new long[] {188, 404});
  }
}
