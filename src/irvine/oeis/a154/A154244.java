package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154244 <code>a(n) = 6*a(n-1) - 2*a(n-2)</code> for <code>n&gt;1</code>; <code>a(1)=1, a(2)=6</code>.
 * @author Sean A. Irvine
 */
public class A154244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154244() {
    super(new long[] {-2, 6}, new long[] {1, 6});
  }
}
