package irvine.oeis.a108;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A108238 Numbers of the form (7^i)*(12^j), with i, j &gt;= 0.
 * @author Georg Fischer
 */
public class A108238 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A108238() {
    super(1, 0, 0, (i, j) -> Z.SEVEN.pow(i).multiply(Z.valueOf(12).pow(j)));
  }
}
