package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000578;

/**
 * A076204 Numbers whose cube has a prime sum of digits.
 * @author Sean A. Irvine
 */
public class A076204 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076204() {
    super(1, 0, new A000578(), k -> Functions.DIGIT_SUM.z(k).isProbablePrime());
  }
}
