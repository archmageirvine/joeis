package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154277 <code>a(n) = 81*n^2 - 72*n + 17</code>.
 * @author Sean A. Irvine
 */
public class A154277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154277() {
    super(new long[] {1, -3, 3}, new long[] {17, 26, 197});
  }
}
