package irvine.oeis.a032;

import irvine.oeis.LinearRecurrence;

/**
 * A032438 a(n) = n^2 - floor((n+1)/2)^2.
 * @author Sean A. Irvine
 */
public class A032438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A032438() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 0, 3, 5, 12});
  }
}
