package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098150 <code>a(n) = 2(a(n-2) - a(n-1)) + a(n-3)</code> where <code>a(0)=-3, a(1)=11</code> &amp; <code>a(2)=-30</code>.
 * @author Sean A. Irvine
 */
public class A098150 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098150() {
    super(new long[] {-1, -3}, new long[] {-3, 11});
  }
}
