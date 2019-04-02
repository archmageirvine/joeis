package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252630 Numbers n such that the sum of the hexagonal numbers X(n), X(n+1), X(n+2) and X(n+3) is equal to the heptagonal number H(m) for some m.
 * @author Sean A. Irvine
 */
public class A252630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252630() {
    super(new long[] {1, -323, 323}, new long[] {50, 16503, 5314316});
  }
}
