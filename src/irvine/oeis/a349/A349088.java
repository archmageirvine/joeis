package irvine.oeis.a349;
// Generated by gen_seq4.pl 2025-05-11.ack/multia at 2025-05-11 22:56

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A349088 a(n) = n! * Sum_{k=0..floor((n-1)/3)} 1 / (3*k+1)!.
 * @author Georg Fischer
 */
public class A349088 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A349088() {
    super(0, (self, n) -> n == 0 ? Z.ZERO : Rationals.SINGLETON.sum(0, (n - 1) / 3, k -> new Q(1).divide(Functions.FACTORIAL.z(3 * k + 1))).multiply(Functions.FACTORIAL.z(n)).num(), "");
  }
}
