package irvine.oeis.a166;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A166265 Numbers of the form 1+x^2+y^2, x, y integers &gt;= 1.
 * @author Georg Fischer
 */
public class A166265 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A166265() {
    super(1, 1, 1, (x, y) -> Z.valueOf(1 + x * x + y * y));
  }
}
