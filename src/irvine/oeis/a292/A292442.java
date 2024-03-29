package irvine.oeis.a292;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A292442 a(n) = A292441(n)^2.
 * @author Georg Fischer
 */
public class A292442 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A292442() {
    super(0, new A292441(), v -> v.square());
  }
}
