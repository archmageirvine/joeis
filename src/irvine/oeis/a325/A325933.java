package irvine.oeis.a325;
// manually robots/partsun at 2026-09-05 22: 13

import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;

/**
 * A325933 Partial sums of A325931.
 * @author Georg Fischer
 */
public class A325933 extends PrependSequence {

  /** Construct the sequence. */
  public A325933() {
    super(0, new PartialSumSequence(0, new A325931()), 0);
  }
}
