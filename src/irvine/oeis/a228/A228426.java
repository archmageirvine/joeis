package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A228426 Numerator of Sum(i=1..n-1, 1/i^(2*n-1)).
 * @author Georg Fischer
 */
public class A228426 extends LambdaSequence {

  /** Construct the sequence. */
  public A228426() {
    super(1, n -> Rationals.SINGLETON.sum(1, n - 1, i -> new Q(Z.ONE, Z.valueOf(i).pow(2L * n - 1))).num());
  }
}
