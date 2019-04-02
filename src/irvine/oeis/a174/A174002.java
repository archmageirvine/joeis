package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174002 a(n) = n*binomial(n+4, 4).
 * @author Sean A. Irvine
 */
public class A174002 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174002() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 5, 30, 105, 280, 630});
  }
}
