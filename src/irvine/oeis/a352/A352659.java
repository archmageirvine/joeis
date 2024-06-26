package irvine.oeis.a352;
// Generated by gen_seq4.pl 2023-09-21/LAMBDA at 2023-09-21 17:48

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A352659 a(n) = n! * Sum_{k=0..floor(n/3)} 1 / (3*k)!.
 * @author Georg Fischer
 */
public class A352659 extends LambdaSequence {

  /** Construct the sequence. */
  public A352659() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.ONE, Functions.FACTORIAL.z(3 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}
