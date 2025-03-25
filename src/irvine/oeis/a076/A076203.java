package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000079;

/**
 * A076203 Numbers n such that the sum of the digits of 2^n is prime.
 * @author Sean A. Irvine
 */
public class A076203 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076203() {
    super(1, 0, new A000079(), k -> Functions.DIGIT_SUM.z(k).isProbablePrime());
  }
}
