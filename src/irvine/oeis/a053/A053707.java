package irvine.oeis.a053;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a025.A025475;

/**
 * A053707 First differences of A025475, powers of a prime but not prime.
 * @author Sean A. Irvine
 */
public class A053707 extends DifferenceSequence {

  /** Construct the sequence. */
  public A053707() {
    super(1, new A025475());
  }
}
