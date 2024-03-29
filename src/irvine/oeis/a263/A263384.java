package irvine.oeis.a263;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-25 11:10

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A263384 Fourth column of the matrix of polynomial coefficients of the rational approximation to Mill's ratio.
 * a(n)=(prod(k=1,n+3,2*k)-3*prod(k=1,n+3,(2*k-1))+prod(k=1,n+2,2*k-1))/6;
 * @author Georg Fischer
 */
public class A263384 extends LambdaSequence {

  /** Construct the sequence. */
  public A263384() {
    super(0, n -> Integers.SINGLETON.product(1, n + 3, k -> Z.TWO.multiply(k)).subtract(Z.THREE.multiply(Integers.SINGLETON.product(1, n + 3, k -> Z.valueOf(2L * k - 1)))).add(Integers.SINGLETON.product(1, n + 2, k -> Z.TWO.multiply(k).subtract(Z.ONE))).divide(Z.SIX));
  }
}
