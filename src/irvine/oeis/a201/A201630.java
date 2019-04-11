package irvine.oeis.a201;

import irvine.oeis.LinearRecurrence;

/**
 * A201630 <code>a(n) = a(n-1)+2*a(n-2)</code> with <code>n&gt;1, a(0)=2, a(1)=7</code>.
 * @author Sean A. Irvine
 */
public class A201630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A201630() {
    super(new long[] {2, 1}, new long[] {2, 7});
  }
}
