package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026049 a(n) = dot_product(1,2,...,n)*(7,8,...,n,1,2,3,4,5,6).
 * @author Sean A. Irvine
 */
public class A026049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026049() {
    super(new long[] {-1, 4, -6, 4}, new long[] {119, 156, 204, 265});
  }
}
