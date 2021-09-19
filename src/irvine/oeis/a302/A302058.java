package irvine.oeis.a302;
// manually 2021-09-17

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000330;

/**
 * A302058 Numbers that are not square pyramidal numbers.
 * @author Georg Fischer
 */
public class A302058 extends ComplementSequence {

  /** Construct the sequence. */
  public A302058() {
    super(new A000330());
  }
}
