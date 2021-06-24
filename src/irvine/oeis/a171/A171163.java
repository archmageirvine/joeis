package irvine.oeis.a171;
// manually 2021-06-24

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001146;

/**
 * A171163 Number of children at height n in a doubly logarithmic tree. Leaves are at height 0.
 * @author Georg Fischer
 */
public class A171163 extends PrependSequence {

  /** Construct the sequence. */
  public A171163() {
    super(new A001146(), 0, 2);
  }
}
