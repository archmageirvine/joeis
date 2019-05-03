package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026384 <code>a(n) = Sum_{j=0..i, i=0..n} T(i,j)</code>, where T is the array in <code>A026374</code>.
 * @author Sean A. Irvine
 */
public class A026384 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026384() {
    super(new long[] {-5, 5, 1}, new long[] {1, 3, 8});
  }
}
