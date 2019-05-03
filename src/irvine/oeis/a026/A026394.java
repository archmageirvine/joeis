package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026394 <code>a(n) = T(n,n-3)</code>, where T is the array in <code>A026386</code>.
 * @author Sean A. Irvine
 */
public class A026394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026394() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 5, 17, 34, 75, 114, 202});
  }
}
