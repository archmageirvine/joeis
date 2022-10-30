package irvine.oeis.a173;
// manually partsumm/partsum at 2022-03-24 22:32

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a027.A027868;

/**
 * A173345 Number of trailing zeros of the superfactorial of n (A000178).
 * @author Georg Fischer
 */
public class A173345 extends PartialSumSequence {

  /** Construct the sequence. */
  public A173345() {
    super(1, new A027868());
    next();
  }
}
