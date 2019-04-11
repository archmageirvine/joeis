package irvine.oeis.a105;

import irvine.oeis.LinearRecurrence;

/**
 * A105332 <code>a(n) = n*(n+1)/2 mod 8</code>.
 * @author Sean A. Irvine
 */
public class A105332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105332() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {0, 1, 3, 6, 2, 7, 5, 4, 4, 5, 7, 2, 6, 3, 1});
  }
}
