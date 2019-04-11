package irvine.oeis.a030;

import irvine.oeis.LinearRecurrence;

/**
 * A030186 <code>a(n) = 3*a(n-1) + a(n-2) - a(n-3)</code> for <code>n &gt;= 3, a(0)=1, a(1)=2, a(2)=7</code>.
 * @author Sean A. Irvine
 */
public class A030186 extends LinearRecurrence {

  /** Construct the sequence. */
  public A030186() {
    super(new long[] {-1, 1, 3}, new long[] {1, 2, 7});
  }
}
