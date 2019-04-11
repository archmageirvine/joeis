package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264854 <code>a(n) = n*(n + 1)*(11*n^2 + 11*n - 10)/24</code>.
 * @author Sean A. Irvine
 */
public class A264854 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264854() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 14, 61, 175});
  }
}
