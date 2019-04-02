package irvine.oeis.a012;

import irvine.oeis.LinearRecurrence;

/**
 * A012880 a(n+3) = 5*a(n+2)-4*a(n+1)+a(n).
 * @author Sean A. Irvine
 */
public class A012880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A012880() {
    super(new long[] {1, -4, 5}, new long[] {0, 1, 3});
  }
}
