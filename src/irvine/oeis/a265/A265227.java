package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265227 Nonnegative m for which k*floor(m^2/9) = floor(k*m^2/9), with 2 &lt; k &lt; 9.
 * @author Sean A. Irvine
 */
public class A265227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265227() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 3, 6, 8, 9});
  }
}
