package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171237 <code>a(0)=2, a(1)=3, a(n)=3+a(n-1)+a(n-2)</code> for <code>n&gt;=2</code>.
 * @author Sean A. Irvine
 */
public class A171237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171237() {
    super(new long[] {-1, 0, 2}, new long[] {2, 3, 8});
  }
}
