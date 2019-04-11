package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242073 <code>a(n) = - (a(n-1)*a(n-4) + a(n-2)*a(n-3)) / a(n-5)</code> with <code>a(0)=1, a(1)=a(2)=-1, a(3)=-2, a(4)=1</code>.
 * @author Sean A. Irvine
 */
public class A242073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242073() {
    super(new long[] {-1, 0, 0, 0, 0, 0}, new long[] {1, -1, -1, -2, 1, -1});
  }
}
