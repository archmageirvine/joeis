package irvine.oeis.a059;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a005.A005385;

/**
 * A059322 First differences of sequence of consecutive safe primes.
 * @author Sean A. Irvine
 */
public class A059322 extends DifferenceSequence {

  /** Construct the sequence. */
  public A059322() {
    super(new A005385());
  }
}
