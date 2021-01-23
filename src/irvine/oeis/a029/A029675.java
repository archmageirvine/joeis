package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029675 Numbers represented by quadratic form with Gram matrix [ 3, 1, -1; 1, 4, 1; -1, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A029675 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029675() {
    super(new long[][] {{3, 1, -1}, {1, 4, 1}, {-1, 1, 3}});
  }
}
