package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179619 <code>a(1)=1, a(n+1) = 10*a(n)+2*n-1</code>.
 * @author Sean A. Irvine
 */
public class A179619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179619() {
    super(new long[] {10, -21, 12}, new long[] {1, 13, 135});
  }
}
