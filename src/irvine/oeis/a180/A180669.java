package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180669 <code>a(n) = a(n-1)+a(n-2)+a(n-3)+4*n^2-16*n+18</code> with <code>a(0)=0, a(1)=0</code> and <code>a(2)=1</code>.
 * @author Sean A. Irvine
 */
public class A180669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180669() {
    super(new long[] {-1, 2, -1, 2, -5, 4}, new long[] {0, 0, 1, 7, 26, 72});
  }
}
