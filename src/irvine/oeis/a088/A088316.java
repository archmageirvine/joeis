package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088316 <code>a(n) = 13*a(n-1) + a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 13</code>.
 * @author Sean A. Irvine
 */
public class A088316 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088316() {
    super(new long[] {1, 13}, new long[] {2, 13});
  }
}
