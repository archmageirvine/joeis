package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052977 Expansion of (1-x)(1+x)/ (1-x-x^2-x^3+x^5).
 * @author Sean A. Irvine
 */
public class A052977 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052977() {
    super(new long[] {-1, 0, 1, 1, 1}, new long[] {1, 1, 1, 3, 5});
  }
}
