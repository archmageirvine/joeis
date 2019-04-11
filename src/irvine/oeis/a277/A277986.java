package irvine.oeis.a277;

import irvine.oeis.LinearRecurrence;

/**
 * A277986 <code>a(n) = 74*n - 14</code>.
 * @author Sean A. Irvine
 */
public class A277986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277986() {
    super(new long[] {-1, 2}, new long[] {-14, 60});
  }
}
