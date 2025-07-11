package irvine.oeis.a248;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A248167 Expansion of g.f.:  1 / AGM(1-33*x, sqrt((1-9*x)*(1-121*x))).
 * @author Georg Fischer
 */
public class A248167 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A248167() {
    super(0, new A248168(), v -> v.square());
  }
}
