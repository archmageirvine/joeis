package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131562 a(n)= -3a(n-1) -3a(n-2)-2a(n-3), a(0)=1, a(1)=-2, a(2)=2.
 * @author Sean A. Irvine
 */
public class A131562 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131562() {
    super(new long[] {-2, -3, -3}, new long[] {1, -2, 2});
  }
}
