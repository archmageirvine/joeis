package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135055 Pentanacci numbers: a(n) = a(n-1) + a(n-2) + a(n-3) + a(n-4) + a(n-5) for n&gt;4 and with a(0)=-2, a(1)=-1, a(2)=0, a(3)=1, a(4)=2.
 * @author Sean A. Irvine
 */
public class A135055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135055() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {-2, -1, 0, 1, 2});
  }
}
