package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264888 <code>a(n) = n*(n + 1)*(13*n^2 + 13*n - 14)/24</code>.
 * @author Sean A. Irvine
 */
public class A264888 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264888() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 16, 71, 205});
  }
}
