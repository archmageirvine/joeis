package irvine.oeis.a243;

import irvine.oeis.LinearRecurrence;

/**
 * A243399 <code>a(0) = 1, a(1) = 19</code>; for <code>n &gt; 1, a(n) = 19*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A243399 extends LinearRecurrence {

  /** Construct the sequence. */
  public A243399() {
    super(new long[] {1, 19}, new long[] {1, 19});
  }
}
