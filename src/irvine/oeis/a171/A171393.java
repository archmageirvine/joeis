package irvine.oeis.a171;
// Generated by gen_seq4.pl 2024-04-22/filnum at 2024-04-22 22:28

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A171393 Solutions to the equation M(n) = -10 (M = Mertens's function A002321).
 * @author Georg Fischer
 */
public class A171393 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A171393() {
    super(1, 1, n -> Functions.MERTENS.l(n) == -10);
  }
}
