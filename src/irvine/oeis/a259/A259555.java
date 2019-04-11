package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259555 <code>a(n) = 2*n^2 - 2*n + 17</code>.
 * @author Sean A. Irvine
 */
public class A259555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259555() {
    super(new long[] {1, -3, 3}, new long[] {17, 21, 29});
  }
}
