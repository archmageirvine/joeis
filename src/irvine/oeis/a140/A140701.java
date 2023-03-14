package irvine.oeis.a140;
// manually partprom/partprod at 2023-03-12

import irvine.oeis.PartialProductSequence;
import irvine.oeis.a005.A005448;

/**
 * A140701 Partial products of A005448.
 * @author Georg Fischer
 */
public class A140701 extends PartialProductSequence {

  /** Construct the sequence. */
  public A140701() {
    super(0, new A005448());
  }
}
