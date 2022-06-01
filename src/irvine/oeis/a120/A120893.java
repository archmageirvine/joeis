package irvine.oeis.a120;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A120893 a(n) = 3*a(n-1) + 3*a(n-2) - a(n-3); a(0)=1, a(1)=1, a(2)=5.
 * @author Sean A. Irvine
 */
public class A120893 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120893() {
    super(new long[] {-1, 3, 3}, new long[] {1, 1, 5});
  }
}
