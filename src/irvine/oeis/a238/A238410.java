package irvine.oeis.a238;

import irvine.oeis.LinearRecurrence;

/**
 * A238410 <code>a(n) = floor((3(n-1)^2 + 1)/2)</code>.
 * @author Sean A. Irvine
 */
public class A238410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238410() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 2, 6, 14});
  }
}
