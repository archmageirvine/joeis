package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026043 <code>a(n) = dot_product(1,2,...,n)*(5,6,...,n,1,2,3,4)</code>.
 * @author Sean A. Irvine
 */
public class A026043 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026043() {
    super(new long[] {-1, 4, -6, 4}, new long[] {45, 67, 98, 140});
  }
}
