package irvine.oeis.a176;
// Generated by gen_seq4.pl 2023-10-16/trilambn at 2023-10-16 19:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A176331 Triangle read by rows: T(n, k) = Sum_{j=0..n} C(j, n-k) * C(j, k) * (-1)^(n - j).
 * @author Georg Fischer
 */
public class A176331 extends LambdaTriangle {

  /** Construct the sequence. */
  public A176331() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, n, j -> Binomial.binomial(j, n - k).multiply(Binomial.binomial(j, k)).multiply(Z.NEG_ONE.pow(n - j))));
  }
}
