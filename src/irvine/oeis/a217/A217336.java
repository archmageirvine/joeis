package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217336 a(n) = 3^(-1+floor(n/2))*A(n), where A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3 with A(0)=A(1)=3, A(2)=11.
 * @author Sean A. Irvine
 */
public class A217336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217336() {
    super(new long[] {3, 0, -27, 0, 33, 0}, new long[] {1, 1, 11, 35, 345, 1129});
  }
}
