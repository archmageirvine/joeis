package irvine.oeis.a056;

import irvine.oeis.a001.A001008;
import irvine.oeis.prime.PrimePositionSubsequence;

/**
 * A056903 Numbers n such that the numerator of the rational number 1 + 1/2 + 1/3 + ... + 1/n is a prime number.
 * @author Sean A. Irvine
 */
public class A056903 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A056903() {
    super(new A001008(), 1);
  }
}
