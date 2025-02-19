package irvine.oeis.a372;
// Generated by gen_seq4.pl 2024-11-18.ack/lambdan at 2024-11-18 18:53

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A372250 E.g.f. A(x) satisfies A(x) = exp( x * A(x) * (1 + x^2 * A(x)) ).
 * @author Georg Fischer
 */
public class A372250 extends LambdaSequence {

  /** Construct the sequence. */
  public A372250() {
    super(0, n -> new Q(Functions.FACTORIAL.z(n)).multiply(Rationals.SINGLETON.sum(0, n / 3, k -> new Q(n - k + 1).pow(n - 2L * k - 1).divide(new Q(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(n - 3 * k))))).num());
  }
}
