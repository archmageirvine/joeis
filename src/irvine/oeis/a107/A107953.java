package irvine.oeis.a107;

import irvine.oeis.LinearRecurrence;

/**
 * A107953 Number of chains in the power set lattice of an (n+3)-element set X_(n+3) of specification <code>n^1 2^1 1</code>, that is, n identical objects of one kind, 2 identical objects of another kind and one other kind. It is the same as the number of fuzzy subsets X_(n+3).
 * @author Sean A. Irvine
 */
public class A107953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107953() {
    super(new long[] {16, -48, 56, -32, 9}, new long[] {31, 175, 703, 2415, 7551});
  }
}
