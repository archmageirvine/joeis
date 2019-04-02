package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180713 If n is even then a(n) = 3n, if n == 1 mod 4 then a(n) = 3n+1, if n == 3 mod 4 then a(n) = 3n+2.
 * @author Sean A. Irvine
 */
public class A180713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180713() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 6, 11, 12});
  }
}
