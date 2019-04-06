package irvine.oeis.a108;

import irvine.oeis.FiniteSequence;

/**
 * A108508 Number of paths of length n between two arbitrary, distinct vertices in K6, the complete graph on 6 vertices.
 * @author Georg Fischer
 */
public class A108508 extends FiniteSequence {

  /** Construct the sequence. */
  public A108508() {
    super(1, 4, 12, 48, 180, 528, 1392, 3600, 7920, 13680, 21840, 31872, 25008);
  }
}
