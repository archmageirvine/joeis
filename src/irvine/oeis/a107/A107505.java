package irvine.oeis.a107;

import irvine.oeis.GramMatrixThetaSeries;

/**
 * A107505 Theta series of quadratic form with Gram matrix [ 2, 1, 0, 1; 1, 4, 1, 0; 0, 1, 4, -2; 1, 0, -2, 8].
 * @author Georg Fischer
 */
public class A107505 extends GramMatrixThetaSeries {

  /** Construct the sequence. */
  public A107505() {
    super(new long[][]{
      {2, 1, 0, 1},
      {1, 4, 1, 0},
      {0, 1, 4, -2},
      {1, 0, -2, 8}
    }, 2);
  }
}
