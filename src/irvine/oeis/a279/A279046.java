package irvine.oeis.a279;
// Generated by gen_seq4.pl 2024-06-19/lambdan at 2024-06-19 23:57

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a000.A000178;

/**
 * A279046 a(n) = A000178(n) * Sum_{k=0..n} (-1)^k/k!.
 * @author Georg Fischer
 */
public class A279046 extends LambdaSequence {

  private static final DirectSequence A000178 = new A000178();

  /** Construct the sequence. */
  public A279046() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Z.NEG_ONE.pow(k), Functions.FACTORIAL.z(k))).multiply(A000178.a(n)).num());
  }
}
