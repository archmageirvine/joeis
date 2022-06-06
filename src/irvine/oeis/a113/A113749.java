package irvine.oeis.a113;

import irvine.math.z.Z;
import irvine.oeis.a112.A112557;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A113749 Consider the generalized Mancala solitaire (A002491); to get n-th term, start with n and successively round up to next k multiples of n-1, n-2, ..., 1, for n&gt;=1. Now construct the array, t, such that t(n,k) is the n-th and successively rounding up to the next k multiples. This sequence is the presentation of that array by reading the antidiagonals.
 * @author Georg Fischer
 */
public class A113749 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A113749() {
    super(1, -1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return A112557.roundUp(n, k);
  }
}
