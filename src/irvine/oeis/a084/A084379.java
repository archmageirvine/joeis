package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084379 <code>a(n) = n^3 + 17</code>.
 * @author Sean A. Irvine
 */
public class A084379 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084379() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 18, 25, 44});
  }
}
