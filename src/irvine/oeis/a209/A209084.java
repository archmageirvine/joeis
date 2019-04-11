package irvine.oeis.a209;

import irvine.oeis.LinearRecurrence;

/**
 * A209084 <code>a(n) = 2*a(n-1) + 4*a(n-2)</code> with <code>n&gt;1, a(0)=0, a(1)=4</code>.
 * @author Sean A. Irvine
 */
public class A209084 extends LinearRecurrence {

  /** Construct the sequence. */
  public A209084() {
    super(new long[] {4, 2}, new long[] {0, 4});
  }
}
