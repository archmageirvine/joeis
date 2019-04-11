package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099048 Number of 5 X <code>n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00</code>;1), <code>(01</code>;0), <code>(10</code>;0) and <code>(11</code>;0).
 * @author Sean A. Irvine
 */
public class A099048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099048() {
    super(new long[] {-1, 2}, new long[] {32, 50});
  }
}
