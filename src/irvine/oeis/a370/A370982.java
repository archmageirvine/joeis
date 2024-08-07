package irvine.oeis.a370;
// Generated by gen_seq4.pl 2024-04-02/lambdan at 2024-04-02 23:05

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A370982 a(n) = Sum_{k=0..n} 2^(n - k)*Pochhammer(k/2, n - k). Row sums of A370419(n - k, k).
 * @author Georg Fischer
 */
public class A370982 extends LambdaSequence {

  /** Construct the sequence. */
  public A370982() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> Rationals.SINGLETON.product(0, n - k - 1, j -> new Q(2L * j + k, 2)).multiply(Z.TWO.pow(n - k))).num());
  }
}
