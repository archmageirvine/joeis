package irvine.oeis.a107;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A107466 Numbers of the form (5^i)*(13^j).
 * @author Georg Fischer
 */
public class A107466 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A107466() {
    super(1, 0, 0, (i, j) -> Z.FIVE.pow(i).multiply(Z.valueOf(13).pow(j)));
  }
}
