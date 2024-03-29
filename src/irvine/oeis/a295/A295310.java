package irvine.oeis.a295;
// Generated by gen_seq4.pl 2024-03-26/simtraf at 2024-03-26 23:22

import irvine.math.z.Z;
import irvine.oeis.a062.A062401;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A295310 a(n) = gcd(n, A062401(n)), where A062401(n) = phi(sigma(n)).
 * @author Georg Fischer
 */
public class A295310 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A295310() {
    super(1, new A062401(), (n, v) -> v.gcd(Z.valueOf(n)));
  }
}
