package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162356 <code>a(n) = 8*a(n-1)-14*a(n-2)</code> for <code>n&gt;1; a(0) = 2; a(1) = 9</code>.
 * @author Sean A. Irvine
 */
public class A162356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162356() {
    super(new long[] {-14, 8}, new long[] {2, 9});
  }
}
