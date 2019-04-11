package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180713 If n is even then <code>a(n) = 3n,</code> if <code>n == 1 mod 4</code> then <code>a(n) = 3n+1,</code> if <code>n == 3 mod 4</code> then <code>a(n) = 3n+2</code>.
 * @author Sean A. Irvine
 */
public class A180713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180713() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 4, 6, 11, 12});
  }
}
