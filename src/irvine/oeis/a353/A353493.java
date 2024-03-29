package irvine.oeis.a353;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.math.z.Z;
import irvine.oeis.a003.A003415;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A353493 The arithmetic derivative of n, reduced modulo 4.
 * @author Georg Fischer
 */
public class A353493 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A353493() {
    super(0, new A003415(), v -> v.mod(Z.FOUR));
  }
}
