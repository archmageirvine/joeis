package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179994 <code>a(n) = 11*a(n-2) - 8*a(n-4),</code> starting <code>a(0)=0, a(1)=1, a(2)=5, a(3)=12</code>.
 * @author Sean A. Irvine
 */
public class A179994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179994() {
    super(new long[] {-8, 0, 11, 0}, new long[] {0, 1, 5, 12});
  }
}
