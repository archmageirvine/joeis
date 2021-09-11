package irvine.oeis.a051;

import irvine.oeis.PrimePositionSubsequence;
import irvine.oeis.a000.A000081;

/**
 * A051420 n such that A000081(n) is prime.
 * @author Sean A. Irvine
 */
public class A051420 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A051420() {
    super(new A000081(), 0);
  }
}
