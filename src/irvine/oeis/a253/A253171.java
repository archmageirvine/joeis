package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253171 a(n) = number of permutations of (1,2,...,n) producible by an ordered triple of distinct transpositions.
 * @author Sean A. Irvine
 */
public class A253171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253171() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {3, 12, 60, 240, 756, 1988, 4572});
  }
}
