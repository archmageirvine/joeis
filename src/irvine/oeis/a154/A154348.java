package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154348 <code>a(n) = 16*a(n-1) - 56*a(n-2)</code> for <code>n&gt;1</code>, with <code>a(0)=0, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A154348 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154348() {
    super(new long[] {-56, 16}, new long[] {1, 16});
  }
}
