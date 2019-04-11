package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099945 Number of 4 X n binary matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00</code>;1) and <code>(11</code>;0).
 * @author Sean A. Irvine
 */
public class A099945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099945() {
    super(new long[] {-2, 3}, new long[] {188, 404});
  }
}
