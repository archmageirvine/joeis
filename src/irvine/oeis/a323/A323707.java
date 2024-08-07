package irvine.oeis.a323;
// Generated by gen_seq4.pl 2024-07-02/lambdan at 2024-07-03 22:28

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A323707 a(n) = denominator of Sum_{d|n} tau(d)/pod(d) where tau(k) = the number of the divisors of k (A000005) and pod(k) = the product of the divisors of k (A007955).
 * @author Georg Fischer
 */
public class A323707 extends LambdaSequence {

  /** Construct the sequence. */
  public A323707() {
    super(1, n -> Rationals.SINGLETON.sumdiv(n, d -> new Q(Functions.TAU.z(d), Functions.POD.z(d))).den());
  }
}
