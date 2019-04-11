package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052959 <code>a(2n) = a(2n-1)+a(2n-2), a(2n+1) = a(2n)+a(2n-1)-1, a(0)=2, a(1)=1</code>.
 * @author Sean A. Irvine
 */
public class A052959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052959() {
    super(new long[] {-1, -1, 2, 1}, new long[] {2, 1, 3, 3});
  }
}
