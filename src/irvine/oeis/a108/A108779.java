package irvine.oeis.a108;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A108779 Numbers of the form (10^i)*(11^j), with i, j &gt;= 0.
 * @author Georg Fischer
 */
public class A108779 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A108779() {
    super(1, 0, 0, (i, j) -> Z.TEN.pow(i).multiply(Z.valueOf(11).pow(j)));
  }
}
