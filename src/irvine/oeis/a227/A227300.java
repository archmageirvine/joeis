package irvine.oeis.a227;

import irvine.oeis.LinearRecurrence;

/**
 * A227300 Rising diagonal sums of triangle of Fibonacci polynomials (rows displayed as centered <code>text)</code>.
 * @author Sean A. Irvine
 */
public class A227300 extends LinearRecurrence {

  /** Construct the sequence. */
  public A227300() {
    super(new long[] {-1, 0, 0, 2, 0, 1}, new long[] {1, 2, 2, 3, 7, 11});
  }
}
