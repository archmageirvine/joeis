package irvine.oeis.a324;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A324801 Denominator of Sum_{k=1..n} 1/(k*(prime(k+1)-prime(k))).
 * @author Georg Fischer
 */
public class A324801 extends LambdaSequence {

  /** Construct the sequence. */
  public A324801() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(1, Z.valueOf(k).multiply(Functions.PRIME.z(k + 1).subtract(Functions.PRIME.z(k))))).den());
  }
}
