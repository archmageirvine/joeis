package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099041 Number of 3 X <code>n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) <code>(00</code>;1), <code>(10</code>;0) and <code>(10</code>;1).
 * @author Sean A. Irvine
 */
public class A099041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099041() {
    super(new long[] {2, -5, 4}, new long[] {1, 8, 24});
  }
}
