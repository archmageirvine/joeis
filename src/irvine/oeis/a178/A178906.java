package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178906 <code>a(n)= 111*a(n-1)-100*a(n-2)</code> with <code>a(0)=0</code> and a(1)=1.
 * @author Sean A. Irvine
 */
public class A178906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178906() {
    super(new long[] {-100, 111}, new long[] {0, 1});
  }
}
