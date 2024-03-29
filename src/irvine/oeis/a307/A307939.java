package irvine.oeis.a307;
// generated by patch_offset.pl at 2022-08-16 19:10

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A307939 Number of (undirected) Hamiltonian paths in the n-dipyramidal graph.
 * @author Georg Fischer
 */
public class A307939 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A307939() {
    super(3, "[0, 1,-4, 6,-4, 1]", "[36, 120, 310, 660, 1218]", 0);
  }
}
