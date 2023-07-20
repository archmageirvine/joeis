package irvine.oeis.a071;
// manually robot/partsum at 2023-07-20

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a004.A004164;

/**
 * A071121 a(n) = a(n-1) + sum of decimal digits of n^3.
 * @author Georg Fischer
 */
public class A071121 extends PartialSumSequence {

  /** Construct the sequence. */
  public A071121() {
    super(1, new A004164());
    next();
  }
}
