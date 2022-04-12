package irvine.oeis.a102;
// manually partsumm/partsum at 2022-04-12 19:21

import irvine.math.z.Z;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000040;

/**
 * A102066 Sum of the first n primes, mod 6.
 * @author Georg Fischer
 */
public class A102066 extends PartialSumSequence {

  /** Construct the sequence. */
  public A102066() {
    super(new A000040());
  }

  @Override
  public Z next() {
    return super.next().mod(Z.SIX);
  }
}
