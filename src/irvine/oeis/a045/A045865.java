package irvine.oeis.a045;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A045865 Theta series of quadratic form with Gram matrix [ 4, 0, 2, 1; 0, 2, 1, 1; 2, 1, 20, 1; 1, 1, 1, 10 ].
 * @author Georg Fischer
 */
public class A045865 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A045865() {
    super(new long[][]{
      {4, 0, 2, 1},
      {0, 2, 1, 1},
      {2, 1, 20, 1},
      {1, 1, 1, 10}
    }, 2);
  }
}
