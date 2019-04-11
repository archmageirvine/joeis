package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256648 28-gonal pyramidal numbers: <code>a(n) = n*(n+1)*(26*n-23)/6</code>.
 * @author Sean A. Irvine
 */
public class A256648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256648() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 29, 110});
  }
}
