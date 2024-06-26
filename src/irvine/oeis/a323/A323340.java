package irvine.oeis.a323;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.oeis.a007.A007840;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A323340 Denominator of the sum of inverse products of parts in all compositions of n.
 * @author Georg Fischer
 */
public class A323340 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A323340() {
    super(0, new A007840(), (n, v) -> new Q(v, Functions.FACTORIAL.z(n)).den());
  }
}
