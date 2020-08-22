package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275876 a(n) = 4*n*(n^2 - 3*n - 1)/3.
 * @author Sean A. Irvine
 */
public class A275876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275876() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, -4, -8, -4});
  }
}
