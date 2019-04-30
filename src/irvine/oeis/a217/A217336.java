package irvine.oeis.a217;

import irvine.oeis.LinearRecurrence;

/**
 * A217336 <code>a(n) = 3^(-1+floor(n/2))*A(n)</code>, where <code>A(n) = 3*A(n-1) + A(n-2) - A(n-3)/3</code> with <code>A(0)=A(1)=3, A(2)=11</code>.
 * @author Sean A. Irvine
 */
public class A217336 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217336() {
    super(new long[] {3, 0, -27, 0, 33, 0}, new long[] {1, 1, 11, 35, 345, 1129});
  }
}
