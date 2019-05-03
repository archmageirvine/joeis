package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107955 Number of chains in the power set lattice or the number of fuzzy subsets of a <code>(n+5)-elements</code> set <code>X_(n+5)</code> with specification n elements of one kind, 4 elements of another and 1 of yet another kind.
 * @author Sean A. Irvine
 */
public class A107955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107955() {
    super(new long[] {64, -256, 432, -400, 220, -72, 13}, new long[] {191, 1471, 7551, 31871, 119231, 410303, 1327103});
  }
}
