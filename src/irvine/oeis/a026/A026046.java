package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026046 a(n) = dot_product(1,2,...,n)*(6,7,...,n,1,2,3,4,5).
 * @author Sean A. Irvine
 */
public class A026046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026046() {
    super(new long[] {-1, 4, -6, 4}, new long[] {76, 105, 144, 195});
  }
}
