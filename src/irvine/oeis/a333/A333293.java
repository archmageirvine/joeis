package irvine.oeis.a333;
// Generated by gen_seq4.pl 2024-12-15.ack/lambdan at 2024-12-15 23:09

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.LambdaSequence;

/**
 * A333293 a(n) = Sum_{k=1..n-1} k^2*phi(k) + n^2*phi(n)/2, where phi = A000010.
 * @author Georg Fischer
 */
public class A333293 extends LambdaSequence {

  /** Construct the sequence. */
  public A333293() {
    super(2, n -> Rationals.SINGLETON.sum(1, n - 1, k -> new Q(k).square().multiply(Functions.PHI.z(k))).add(new Q(n).square().multiply(Functions.PHI.z(n)).divide(2)).num());
  }
}
