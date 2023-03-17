package irvine.oeis.a080;

import irvine.oeis.PartialSumSequence;

/**
 * A080587 Partial sums of A080586.
 * @author Georg Fischer
 */
public class A080587 extends PartialSumSequence {

  /** Construct the sequence. */
  public A080587() {
    super(0, new A080586());
  }
}
