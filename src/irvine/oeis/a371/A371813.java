package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371813 a(n) = Sum_{k=0..n} (-1)^k * binomial(3*n-k-1,n-k).
 * @author Georg Fischer
 */
public class A371813 extends LambdaSequence {

  /** Construct the sequence. */
  public A371813() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(3L * n - k - 1, n - k))));
  }
}
