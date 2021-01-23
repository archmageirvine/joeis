package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221172 a(0)=-2, a(1)=3; thereafter a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A221172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221172() {
    super(new long[] {1, 2}, new long[] {-2, 3});
  }
}
