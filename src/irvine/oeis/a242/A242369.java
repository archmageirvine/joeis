package irvine.oeis.a242;
// manually hygeom/hygeo at 2022-08-05 15:24

import irvine.oeis.HypergeometricSequence;

/**
 * A242369 a(n) = P(n, 1, -2*n-1, 1-2*n)/(n+1), P the Jacobi polynomial.
 * 2F1([1-n, -n], [2], n).
 * @author Georg Fischer
 */
public class A242369 extends HypergeometricSequence {

  /** Construct the sequence. */
  public A242369() {
    super(0, 2, 1, "[[1,-1],[0,-1],[2],[0, 1]]");
  }
}
