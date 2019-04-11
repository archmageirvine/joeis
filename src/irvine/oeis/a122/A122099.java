package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122099 <code>a(0)=1, a(1)=1, a(2)=0, a(n)=-3*a(n-1)+a(n-3)</code> for <code>n&gt;2</code>.
 * @author Sean A. Irvine
 */
public class A122099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122099() {
    super(new long[] {1, 0, -3}, new long[] {1, 1, 0});
  }
}
