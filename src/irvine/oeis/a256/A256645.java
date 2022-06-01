package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256645 25-gonal pyramidal numbers: a(n) = n*(n+1)*(23*n-20)/6.
 * @author Sean A. Irvine
 */
public class A256645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256645() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 26, 98});
  }
}
