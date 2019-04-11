package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215828 <code>a(n) =</code> 7^(floor(n/3))*A(n), where A(n) = A(n-1) + A(n-2) + A(n-3)/7, with A(0)=3, A(1)=1, A(2)=3.
 * @author Sean A. Irvine
 */
public class A215828 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215828() {
    super(new long[] {1, 0, 0, 25, 0, 0, 31, 0, 0}, new long[] {3, 1, 3, 31, 53, 87, 1011, 1673, 2771});
  }
}
