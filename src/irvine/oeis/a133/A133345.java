package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133345 <code>a(n)=2a(n-1)+14a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A133345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133345() {
    super(new long[] {14, 2}, new long[] {1, 1});
  }
}
