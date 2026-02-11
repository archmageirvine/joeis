package irvine.oeis.a122;
// manually 2026-02-10/complem at 2026-02-10 19:43

import irvine.oeis.ComplementSequence;
import irvine.oeis.a029.A029903;

/**
 * A122529 Complement of sequence A029903.
 * @author Georg Fischer
 */
public class A122529 extends ComplementSequence {

  /** Construct the sequence. */
  public A122529() {
    super(1, new A029903());
    next();
  }
}
