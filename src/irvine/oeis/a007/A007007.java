package irvine.oeis.a007;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A007007 Valence of graph of maximal intersecting families of sets.
 * Equals A037952 except for n=1
 * @author Georg Fischer
 */
public class A007007 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A007007() {
    super(1, "[[0],[-8, 4],[2,-4],[-2,-1],[2, 1]]", "[0, 1, 3, 4, 10, 15, 35]", 0);
  }
}
