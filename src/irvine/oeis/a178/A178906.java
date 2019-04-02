package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178906 a(n)= 111*a(n-1)-100*a(n-2) with a(0)=0 and a(1)=1.
 * @author Sean A. Irvine
 */
public class A178906 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178906() {
    super(new long[] {-100, 111}, new long[] {0, 1});
  }
}
