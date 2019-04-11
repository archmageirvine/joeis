package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190974 <code>a(n) = 7*a(n-1) - 5*a(n-2),</code> with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A190974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190974() {
    super(new long[] {-5, 7}, new long[] {0, 1});
  }
}
