package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-26/serrev at 2024-03-26 23:22

import irvine.oeis.recur.GeneratingFunctionSequence;
import irvine.oeis.transform.RevertTransformSequence;

/**
 * A371407 Expansion of (1/x) * Series_Reversion( x / ( (1+x)^2 * (1+3*x)^2 ) ).
 * @author Georg Fischer
 */
public class A371407 extends RevertTransformSequence {

  /** Construct the sequence. */
  public A371407() {
    super(0, new GeneratingFunctionSequence(1, "[0, 1]", "[1, 8, 22, 24, 9]"));
  }
}
