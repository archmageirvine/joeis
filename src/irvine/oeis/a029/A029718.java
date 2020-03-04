package irvine.oeis.a029;

import irvine.oeis.GramMatrixRepresentatives;

/**
 * A029718 Numbers of form <code>2x^2 + 2xy + 3y^2</code>.
 * @author Sean A. Irvine
 */
public class A029718 extends GramMatrixRepresentatives {

  /** Construct the sequence. */
  public A029718() {
    super(new long[][] {{2, 1}, {1, 3}});
  }
}
