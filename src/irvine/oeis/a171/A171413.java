package irvine.oeis.a171;
// manually 2026-02-10/complem at 2026-02-10 19:43

import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005244;

/**
 * A171413 Complement of self-generating sequence A005244.
 * @author Georg Fischer
 */
public class A171413 extends ComplementSequence {

  /** Construct the sequence. */
  public A171413() {
    super(1, new A005244());
    next();
  }
}
