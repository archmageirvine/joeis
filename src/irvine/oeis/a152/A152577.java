package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152577 <code>a(n) = 10^(2*n - 1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A152577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152577() {
    super(new long[] {-100, 101}, new long[] {11, 1001});
  }
}
