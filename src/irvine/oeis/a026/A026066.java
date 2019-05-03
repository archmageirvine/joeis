package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026066 <code>dot_product(n,n-1,...2,1)*(7,8,...,n,1,2,3,4,5,6)</code>.
 * @author Sean A. Irvine
 */
public class A026066 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026066() {
    super(new long[] {-1, 4, -6, 4}, new long[] {105, 168, 246, 340});
  }
}
