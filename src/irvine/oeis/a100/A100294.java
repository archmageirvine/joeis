package irvine.oeis.a100;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A100294 Numbers of the form a^5 + b^4 with a, b &gt; 0.
 * @author Georg Fischer
 */
public class A100294 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A100294() {
    super(1, 1, 1, (a, b) -> Z.valueOf(a).pow(5).add(Z.valueOf(b).pow(4)));
  }
}
