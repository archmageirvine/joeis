package irvine.oeis.a101;

import irvine.oeis.LinearRecurrence;

/**
 * A101166 <code>a(n) = (15*n^4 + 22*n^3 + 45*n^2 + 14*n) / 24</code>.
 * @author Sean A. Irvine
 */
public class A101166 extends LinearRecurrence {

  /** Construct the sequence. */
  public A101166() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 26, 94, 251});
  }
}
