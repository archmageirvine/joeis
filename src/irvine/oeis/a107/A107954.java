package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107954 Number of chains in the power set lattice, or the number of fuzzy subsets of an (n+4)-element set X_(n+4) with specification n elements of one kind, 3 elements of another and 1 of yet another kind.
 * @author Sean A. Irvine
 */
public class A107954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107954() {
    super(new long[] {-32, 112, -160, 120, -50, 11}, new long[] {79, 527, 2415, 9263, 31871, 101759});
  }
}
