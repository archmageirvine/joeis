package irvine.oeis.a120;
// Generated by gen_seq4.pl 2024-01-04/lambdan at 2024-01-05 23:45

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A120269 Numerator of Sum_{k=1..n} 1/(2k-1)^4.
 * @author Georg Fischer
 */
public class A120269 extends LambdaSequence {

  /** Construct the sequence. */
  public A120269() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.ONE, Z.valueOf(2L * k - 1).pow(4))).num());
  }
}
