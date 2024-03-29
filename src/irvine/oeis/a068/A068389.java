package irvine.oeis.a068;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a025.A025476;

/**
 * A068389 Differences between the primes generating the n-th prime power.
 * @author Sean A. Irvine
 */
public class A068389 extends DifferenceSequence {

  /** Construct the sequence. */
  public A068389() {
    super(0, new A025476());
  }
}

