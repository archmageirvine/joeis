package irvine.oeis.a106;
// Generated by gen_seq4.pl 2024-03-19/simtraf at 2024-03-19 22:04

import irvine.oeis.a001.A001358;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A106146 Semiprimes (mod 10).
 * @author Georg Fischer
 */
public class A106146 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A106146() {
    super(1, new A001358(), v -> v.modZ(10));
  }
}
