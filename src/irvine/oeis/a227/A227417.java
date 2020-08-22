package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227417 Integer triples a(3n-2) = n, a(3n-1) = n+4, and a(3n) = n+7.
 * @author Sean A. Irvine
 */
public class A227417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227417() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 5, 8, 2});
  }
}
