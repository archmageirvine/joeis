package irvine.oeis.a071;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;

/**
 * A071200 Primes which do not appear in A071196.
 * @author Sean A. Irvine
 */
public class A071200 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A071200() {
    super(new A000040(), new A071199());
  }
}
