package irvine.oeis.a051;

import irvine.oeis.a000.A000081;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A051420 Numbers k such that A000081(k) is prime.
 * @author Sean A. Irvine
 */
public class A051420 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A051420() {
    super(new A000081(), 0);
  }
}
