package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217274 <code>a(n) = 7*a(n-1) - 14*a(n-2) + 7*a(n-3)</code> with <code>a(0)=0, a(1)=1, a(2)=7</code>.
 * @author Sean A. Irvine
 */
public class A217274 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217274() {
    super(new long[] {7, -14, 7}, new long[] {0, 1, 7});
  }
}
