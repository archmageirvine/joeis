package irvine.oeis.a118;
// manually at 2024-03-29

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A118384 Gaussian column reduction of Hankel matrix for central Delannoy numbers.
 * @author Georg Fischer
 */
public class A118384 extends LambdaTriangle {

  /** Construct the sequence. */
  public A118384() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, n - k, i -> Binomial.binomial(n, i).multiply(Binomial.binomial(n, n - k - i)).multiply(Z.TWO.pow(i))));
  }
}
