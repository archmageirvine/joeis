package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164536 <code>a(n) = 10*a(n-1) - 23*a(n-2)</code> for <code>n &gt; 1</code>; <code>a(0) = 3, a(1) = 23</code>.
 * @author Sean A. Irvine
 */
public class A164536 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164536() {
    super(new long[] {-23, 10}, new long[] {3, 23});
  }
}
