package irvine.oeis.a091;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A091530 a(n) = Sum_{k=1..n} H(k) k! (n-k)!, where H(k) is the k-th harmonic number.
 * @author Georg Fischer
 */
public class A091530 extends LambdaSequence {

  /** Construct the sequence. */
  public A091530() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> Rationals.SINGLETON.sum(1, k, i -> Q.ONE.divide(i)).multiply(new Q(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(n - k)))).num());
  }
}
