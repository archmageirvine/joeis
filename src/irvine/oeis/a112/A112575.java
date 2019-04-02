package irvine.oeis.a112;

import irvine.oeis.LinearRecurrence;

/**
 * A112575 Chebyshev transform of the second kind of the Pell numbers.
 * @author Sean A. Irvine
 */
public class A112575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112575() {
    super(new long[] {-1, 2, -1, 2}, new long[] {0, 1, 2, 3});
  }
}
