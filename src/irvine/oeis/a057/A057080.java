package irvine.oeis.a057;

import irvine.oeis.LinearRecurrence;

/**
 * A057080 Even-indexed Chebyshev U-polynomials evaluated at <code>sqrt(10)/2</code>.
 * @author Sean A. Irvine
 */
public class A057080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057080() {
    super(new long[] {-1, 8}, new long[] {1, 9});
  }
}
