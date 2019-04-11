package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275709 <code>a(n) = 2*n^3 + 3*n^2</code>.
 * @author Sean A. Irvine
 */
public class A275709 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275709() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 5, 28, 81});
  }
}
