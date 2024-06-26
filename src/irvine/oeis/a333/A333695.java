package irvine.oeis.a333;
// Generated by gen_seq4.pl 2024-03-30/simtraf at 2024-03-30 20:29

import irvine.math.q.Q;
import irvine.oeis.a057.A057660;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A333695 Numerators of coefficients in expansion of Sum_{k&gt;=1} phi(k) * log(1/(1 - x^k)).
 * @author Georg Fischer
 */
public class A333695 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A333695() {
    super(1, new A057660(), (n, v) -> new Q(v, n).num());
  }
}
