package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256647 27-gonal pyramidal numbers: a(n) = n*(n+1)*(25*n-22)/6.
 * @author Sean A. Irvine
 */
public class A256647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256647() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 28, 106});
  }
}
