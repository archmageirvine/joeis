package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180046 <code>a(n+1) = a(n-3) + a(n-2) - a(n-1) + a(n)</code>.
 * @author Sean A. Irvine
 */
public class A180046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180046() {
    super(new long[] {1, 1, -1, 1}, new long[] {1, 2, 3, 4});
  }
}
