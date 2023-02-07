package irvine.oeis.a061;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a055.A055641;

/**
 * A061217 Number of zeros in the concatenation n(n-1)(n-2)(n-3)...321.
 * @author Sean A. Irvine
 */
public class A061217 extends PartialSumSequence {

  /** Construct the sequence. */
  public A061217() {
    super(1, new SkipSequence(new A055641(), 1));
  }
}
