package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152298 a(n) = (3^n-1)/2 if n odd, (3^n-1)/8 if n even.
 * @author Sean A. Irvine
 */
public class A152298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152298() {
    super(new long[] {-9, 0, 10, 0}, new long[] {0, 1, 1, 13});
  }
}
