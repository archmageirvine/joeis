package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029598 Numbers represented by quadratic form with Gram matrix [ 2, 1, 0; 1, 2, 1; 0, 1, 3 ].
 * @author Sean A. Irvine
 */
public class A029598 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029598() {
    super(new long[][] {{2, 1, 0}, {1, 2, 1}, {0, 1, 3}});
  }
}
