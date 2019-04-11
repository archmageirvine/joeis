package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026040 <code>a(n) =</code> dot_product(1,2,...,n)*(4,5,...,n,1,2,3).
 * @author Sean A. Irvine
 */
public class A026040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026040() {
    super(new long[] {-1, 4, -6, 4}, new long[] {24, 40, 64, 98});
  }
}
