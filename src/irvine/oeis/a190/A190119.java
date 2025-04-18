package irvine.oeis.a190;
// Generated by gen_seq4.pl 2024-11-21.ack/lambdan at 2024-11-21 23:03

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A190119 a(n) = Sum_{k=1..n} lcm(k,k')/k, where k' is arithmetic derivative of k.
 * @author Georg Fischer
 */
public class A190119 extends LambdaSequence {

  /** Construct the sequence. */
  public A190119() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, i -> new Q(Functions.LCM.z(Functions.ARD.z(i), i)).divide(i)).num());
  }
}
