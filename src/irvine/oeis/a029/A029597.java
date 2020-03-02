package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029597 Numbers represented by quadratic form with Gram matrix <code>[ 3, 1, 1; 1, 2, 1; 1, 1, 3 ]</code>.
 * @author Sean A. Irvine
 */
public class A029597 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029597() {
    super(new long[][] {{3, 1, 1}, {1, 2, 1}, {1, 1, 3}});
  }
}
