package irvine.oeis.a283;
// Generated by gen_seq4.pl 2025-02-03.ack/lambdan at 2025-02-03 18:14

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A283828 Number of bounded regions in the Linial arrangement L_{n-1}.
 * @author Georg Fischer
 */
public class A283828 extends LambdaSequence {

  /** Construct the sequence. */
  public A283828() {
    super(1, n -> (n <= 1) ? Z.ZERO : Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k - 1).pow(n - 1).multiply(Binomial.binomial(n, k))).divide(Z.TWO.pow(n)));
  }
}
