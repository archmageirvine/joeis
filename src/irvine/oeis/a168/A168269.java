package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168269 <code>a(n) = 2*n - (-1)^n</code>.
 * @author Sean A. Irvine
 */
public class A168269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168269() {
    super(new long[] {-1, 1, 1}, new long[] {3, 3, 7});
  }
}
