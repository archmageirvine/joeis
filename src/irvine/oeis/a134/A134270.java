package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134270 a(n)=2a(n-1)+a(n-2)-4a(n-4).
 * @author Sean A. Irvine
 */
public class A134270 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134270() {
    super(new long[] {-4, 0, 1, 2}, new long[] {1, 1, 3, 7});
  }
}
