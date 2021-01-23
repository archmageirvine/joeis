package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A036272 Absolute values of differences of absolute values of second differences of primes.
 * @author Sean A. Irvine
 */
public class A036272 extends DifferenceSequence {

  /** Construct the sequence. */
  public A036272() {
    // Abs version of A036263 is not in the OEIS a separate sequence
    super(new A036263() {
      @Override
      public Z next() {
        return super.next().abs();
      }
    });
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}

