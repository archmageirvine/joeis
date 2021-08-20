package irvine.oeis.a050;

import irvine.oeis.PrimePositionSubsequence;
import irvine.oeis.a000.A000149;

/**
 * A050808 Numbers k such that floor(exp(k)) is prime.
 * @author Sean A. Irvine
 */
public class A050808 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A050808() {
    super(new A000149(), 0);
  }
}
