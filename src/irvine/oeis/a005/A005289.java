package irvine.oeis.a005;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A005289 Number of graphs on n nodes with 3 cliques.
 * @author Georg Fischer
 */
public class A005289 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A005289() {
    super(1, "[0, 1,-3, 1, 4,-2,-2,-2, 4, 1,-3, 1]", "[0, 0, 1, 4, 12, 31, 67]", 0);
  }
}
