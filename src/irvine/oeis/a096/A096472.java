package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096472 Numbers containing Pythagorean triples in their divisor set.
 * @author Sean A. Irvine
 */
public class A096472 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096472() {
    super(new long[] {-1, 2}, new long[] {3600, 7200});
  }
}
