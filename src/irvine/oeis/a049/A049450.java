package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049450 Pentagonal numbers multiplied by 2: <code>a(n) = n*(3*n-1)</code>.
 * @author Sean A. Irvine
 */
public class A049450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049450() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 10});
  }
}
