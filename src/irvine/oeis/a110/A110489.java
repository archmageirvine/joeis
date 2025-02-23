package irvine.oeis.a110;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A110489 Row sums of a triangle based on the Catalan numbers.
 * @author Georg Fischer
 */
public class A110489 extends LambdaSequence {

  /** Construct the sequence. */
  public A110489() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> Rationals.SINGLETON.sum(0, n - k, j -> Q.TWO.multiply(j + 1).multiply(Z.valueOf(k - 1).pow(j)).multiply(Binomial.binomial(Z.TWO.multiply(n - k).add(1), n - k - j)).divide(n - k + j + 2))).num());
  }
}
