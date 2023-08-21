package irvine.oeis.a334;
// manually robots/partprod at 2023-08-18 07:58

import irvine.oeis.PartialProductSequence;

/**
 * A334395 Partial products of A334393.
 * @author Georg Fischer
 */
public class A334395 extends PartialProductSequence {

  /** Construct the sequence. */
  public A334395() {
    super(1, new A334393());
  }
}
