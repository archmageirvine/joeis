package irvine.oeis.a222;
// manually 2023-07-10

import irvine.oeis.InverseSequence;

/**
 * A222209 Inverse of permutation in A222208.
 * @author Georg Fischer
 */
public class A222209 extends InverseSequence {

  /** Construct the sequence. */
  public A222209() {
    super(1, new A222208());
  }
}
