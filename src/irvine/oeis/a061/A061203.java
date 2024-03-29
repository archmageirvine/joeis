package irvine.oeis.a061;

import irvine.oeis.PartialSumSequence;

/**
 * A061203 (tau&lt;=)_5(n).
 * @author Sean A. Irvine
 */
public class A061203 extends PartialSumSequence {

  /** Construct the sequence. */
  public A061203() {
    super(1, new A061200());
  }
}
