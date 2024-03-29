package irvine.oeis.a122;
// Generated by gen_seq4.pl 2023-10-16/trilambn at 2023-10-16 19:26

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A122899 Triangle with row sums counting directed animals.
 * @author Georg Fischer
 */
public class A122899 extends LambdaTriangle {

  /** Construct the sequence. */
  public A122899() {
    super(0, 0, 0, (n, k) -> Integers.SINGLETON.sum(0, n, j -> Z.NEG_ONE.pow(n - j).multiply(Binomial.binomial(n, j)).multiply(Binomial.binomial(j + 1, k + 1)).multiply(Binomial.binomial(j, k))));
  }
}
