package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029674 Numbers represented by quadratic form with Gram matrix <code>[ 3, 1, 0; 1, 3, 1; 0, 1, 4 ]</code>.
 * @author Sean A. Irvine
 */
public class A029674 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029674() {
    super(new long[][] {{3, 1, 0}, {1, 3, 1}, {0, 1, 4}});
  }
}
