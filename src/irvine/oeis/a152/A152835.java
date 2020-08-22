package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152835 a(0) = -22; a(n) = n-a(n-1).
 * @author Sean A. Irvine
 */
public class A152835 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152835() {
    super(new long[] {-1, 1, 1}, new long[] {-22, 23, -21});
  }
}
