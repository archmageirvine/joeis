package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256716 a(n) = n*(n+1)*(22*n-19)/6.
 * @author Sean A. Irvine
 */
public class A256716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256716() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 25, 94});
  }
}
