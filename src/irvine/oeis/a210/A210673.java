package irvine.oeis.a210;

import irvine.oeis.LinearRecurrence;

/**
 * A210673 a(n) = a(n-1)+a(n-2)+n-4, a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A210673 extends LinearRecurrence {

  /** Construct the sequence. */
  public A210673() {
    super(new long[] {1, -1, -2, 3}, new long[] {0, 1, -1, -1});
  }
}
