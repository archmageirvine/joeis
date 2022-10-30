package irvine.oeis.a130;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a061.A061909;

/**
 * A130596 Partial sums of skinny numbers (A061909).
 * @author Sean A. Irvine
 */
public class A130596 extends PartialSumSequence {

  /** Construct the sequence. */
  public A130596() {
    super(1, new SkipSequence(new A061909(), 1));
  }
}
