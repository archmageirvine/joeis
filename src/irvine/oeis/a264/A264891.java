package irvine.oeis.a264;

import irvine.oeis.LinearRecurrence;

/**
 * A264891 <code>a(n) = n*(5*n - 3)*(25*n^2 - 15*n - 6)/8</code>.
 * @author Sean A. Irvine
 */
public class A264891 extends LinearRecurrence {

  /** Construct the sequence. */
  public A264891() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 112, 783, 2839});
  }
}
