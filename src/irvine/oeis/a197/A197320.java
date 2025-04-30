package irvine.oeis.a197;
// manually 2025-04-30

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A197320 a(n) = cosh( n*arccosh(3^n) ).
 * @author Georg Fischer
 */
public class A197320 extends LambdaSequence {

  /** Construct the sequence. */
  public A197320() {
    // a(n) = 2^(n^2) * Sum_{k=0..floor(n/2)} C(n, 2*k) * (1 - 1/4^n)^k.
    super(0, n -> Integers.SINGLETON.sum(0, n / 2, k -> Binomial.binomial(n, 2L * k).multiply((Z.TWO.pow(n)).pow(n - 2L * k)).multiply((Z.FOUR.pow(n).subtract(1)).pow(k))));
  }
}
