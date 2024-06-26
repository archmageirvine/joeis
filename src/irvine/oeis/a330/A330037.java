package irvine.oeis.a330;
// Generated by gen_seq4.pl 2024-05-09/simtraf at 2024-05-09 22:36

import irvine.oeis.a055.A055778;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A330037 The sum of digits function modulo 2 of the natural numbers in base phi.
 * @author Georg Fischer
 */
public class A330037 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A330037() {
    super(0, new A055778(), v -> v.modZ(2));
  }
}
