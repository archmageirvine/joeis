package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256859 a(n) = n*(n + 1)*(n + 2)*(n^2 - n + 4)/24.
 * @author Sean A. Irvine
 */
public class A256859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256859() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 6, 25, 80, 210, 476});
  }
}
