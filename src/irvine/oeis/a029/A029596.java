package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029596 Numbers represented by quadratic form with Gram matrix [ 4, 2, 2; 2, 4, 1; 2, 1, 6 ], divided by 2.
 * @author Sean A. Irvine
 */
public class A029596 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029596() {
    super(new long[][] {{4, 2, 2}, {2, 4, 1}, {2, 1, 6}}, 2);
  }
}
