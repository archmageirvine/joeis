package irvine.oeis.a270;

import irvine.oeis.LinearRecurrence;

/**
 * A270710 <code>a(n) = 3*n^2 + 2*n - 1</code>.
 * @author Sean A. Irvine
 */
public class A270710 extends LinearRecurrence {

  /** Construct the sequence. */
  public A270710() {
    super(new long[] {1, -3, 3}, new long[] {-1, 4, 15});
  }
}
