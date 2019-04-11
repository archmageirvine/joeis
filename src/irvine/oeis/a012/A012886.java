package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012886 <code>a(n+3) = 5*a(n+2)-4*a(n+1)+a(n)</code>.
 * @author Sean A. Irvine
 */
public class A012886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012886() {
    super(new long[] {1, -4, 5}, new long[] {1, 2, 3});
  }
}
