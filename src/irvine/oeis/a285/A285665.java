package irvine.oeis.a285;

import irvine.oeis.LinearRecurrence;

/**
 * A285665 <code>a(n) = a(n-1) + 2*a(n-2) - a(n-3) - a(n-4) + 2*a(n-5) - 2*a(n-7)</code> for <code>n&gt;7</code> and where <code>a(0)=2, a(1)=3, a(2)=6, a(3)=10, a(4)=17, a(5)=29, a(6)=51</code>.
 * @author Sean A. Irvine
 */
public class A285665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A285665() {
    super(new long[] {-2, 0, 2, -1, -1, 2, 1}, new long[] {2, 3, 6, 10, 17, 29, 51});
  }
}
