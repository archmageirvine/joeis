package irvine.oeis.a289;
// Generated by gen_seq4.pl 2025-03-16.ack/lambdan at 2025-03-16 17:02

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A289381 a(n) = numerator of Sum_{k=1..n} 1/(2*k-1)!!.
 * @author Georg Fischer
 */
public class A289381 extends LambdaSequence {

  /** Construct the sequence. */
  public A289381() {
    super(1, n -> Rationals.SINGLETON.sum(1, n, k -> new Q(1, Functions.MULTIFACTORIAL.z(2, 2 * k - 1))).num());
  }
}
