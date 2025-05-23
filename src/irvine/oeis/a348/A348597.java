package irvine.oeis.a348;
// Generated by gen_seq4.pl 2025-04-09.ack/multia at 2025-04-09 21:37

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A348597 a(n) = n! * Sum_{k=0..floor(n/3)} (-1)^k / (3*k)!.
 * @author Georg Fischer
 */
public class A348597 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A348597() {
    super(0, (self, n) -> Rationals.SINGLETON.sum(0, n / 3, k -> new Q(Z.NEG_ONE.pow(k), Functions.FACTORIAL.z(3 * k))).multiply(Functions.FACTORIAL.z(n)).num(), "");
  }
}
