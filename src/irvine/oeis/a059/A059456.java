package irvine.oeis.a059;

import irvine.oeis.SetDifferenceSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a005.A005385;

/**
 * A059456 Unsafe primes: primes not in A005385.
 * @author Sean A. Irvine
 */
public class A059456 extends SetDifferenceSequence {

  /** Construct the sequence. */
  public A059456() {
    super(new A000040(), new A005385());
  }
}
