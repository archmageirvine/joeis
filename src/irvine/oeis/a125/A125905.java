package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125905 <code>a(0) = 1, a(1) = -4, a(n) = -4*a(n-1) - a(n-2)</code> for <code>n &gt; 1</code>.
 * @author Sean A. Irvine
 */
public class A125905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125905() {
    super(new long[] {-1, -4}, new long[] {1, -4});
  }
}
