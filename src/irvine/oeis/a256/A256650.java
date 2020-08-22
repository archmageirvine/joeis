package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256650 30-gonal pyramidal numbers: a(n) = n*(n+1)*(28*n-25)/6.
 * @author Sean A. Irvine
 */
public class A256650 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256650() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 31, 118});
  }
}
