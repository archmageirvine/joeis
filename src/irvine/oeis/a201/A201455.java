package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201455 <code>a(n) = 3*a(n-1) + 4*a(n-2)</code> for <code>n&gt;1, a(0)=2, a(1)=3</code>.
 * @author Sean A. Irvine
 */
public class A201455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201455() {
    super(new long[] {4, 3}, new long[] {2, 3});
  }
}
