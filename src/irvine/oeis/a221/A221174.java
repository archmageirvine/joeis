package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221174 a(0)=-4, a(1)=5; thereafter a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A221174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221174() {
    super(new long[] {1, 2}, new long[] {-4, 5});
  }
}
