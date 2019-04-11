package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127262 <code>a(0)=2, a(1)=2, a(n) = 2*a(n-1) + 12*a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A127262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127262() {
    super(new long[] {12, 2}, new long[] {2, 2});
  }
}
