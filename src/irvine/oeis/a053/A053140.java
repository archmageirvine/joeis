package irvine.oeis.a053;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a065.A065091;
import irvine.oeis.a074.A074918;

/**
 * A053140 Odd primes that are not highly-imperfect numbers.
 * @author Sean A. Irvine
 */
public class A053140 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A053140() {
    super(new A065091(), new A074918());
  }
}
