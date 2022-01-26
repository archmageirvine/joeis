package irvine.oeis.a142;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A142992 Square array, read by antidiagonals, of the crystal ball sequences for the root lattices of type C_n.
 * T(n,k) = sum {i = 0..n} C(2*n, 2*i)*C(k+i,n).
 * @author Georg Fischer
 */
public class A142992 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A142992() {
    super(0, 0, 1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return Integers.SINGLETON.sum(0, n, i -> Binomial.binomial(2 * n, 2 * i).multiply(Binomial.binomial(k + i, n)));
  }

  ;
}
