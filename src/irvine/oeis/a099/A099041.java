package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099041 Number of <code>3 X n 0-1</code> matrices avoiding simultaneously the right angled numbered polyomino patterns <code>(ranpp) (00;1), (10;0)</code> and <code>(10;1)</code>.
 * @author Sean A. Irvine
 */
public class A099041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099041() {
    super(new long[] {2, -5, 4}, new long[] {1, 8, 24});
  }
}
