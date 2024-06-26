package irvine.oeis.a265;
// Generated by gen_seq4.pl 2024-05-29/lambdan at 2024-05-29 02:16

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A265709 a(n) = numerator of Sum_{d|n} 1/sigma(d).
 * @author Georg Fischer
 */
public class A265709 extends LambdaSequence {

  /** Construct the sequence. */
  public A265709() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Z.ONE, Functions.SIGMA1.z(d))).num());
  }
}
