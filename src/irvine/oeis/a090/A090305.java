package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090305 <code>a(n) = 16a(n-1) + a(n-2),</code> starting with <code>a(0) = 2</code> and <code>a(1) = 16</code>.
 * @author Sean A. Irvine
 */
public class A090305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090305() {
    super(new long[] {1, 16}, new long[] {2, 16});
  }
}
