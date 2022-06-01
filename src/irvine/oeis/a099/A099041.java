package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099041 Number of 3 X n 0-1 matrices avoiding simultaneously the right angled numbered polyomino patterns (ranpp) (00;1), (10;0) and (10;1).
 * @author Sean A. Irvine
 */
public class A099041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099041() {
    super(new long[] {2, -5, 4}, new long[] {1, 8, 24});
  }
}
