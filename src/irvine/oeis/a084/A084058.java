package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084058 <code>a(n) = 2*a(n-1)+7*a(n-2)</code> for <code>n&gt;1, a(0)=1, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A084058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084058() {
    super(new long[] {7, 2}, new long[] {1, 1});
  }
}
