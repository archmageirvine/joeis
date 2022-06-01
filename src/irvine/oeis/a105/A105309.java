package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105309 a(n) = |b(n)|^2 = x^2 + 3*y*2 where (x,y,y,y) is the quaternion b(n) of the sequence b of quaternions defined by b(0)=1,b(1)=1, b(n) = b(n-1) + b(n-2)*(0,c,c,c) where c = 1/sqrt(3).
 * @author Sean A. Irvine
 */
public class A105309 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105309() {
    super(new long[] {-1, 1, 2, 1}, new long[] {1, 1, 2, 5});
  }
}
