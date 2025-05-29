package irvine.oeis.a095;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A096555 Consecutive internal states of the linear congruential pseudo-random number generator RANDU that was used in the IBM Scientific Subroutine Library for IBM System/360 computers in the 1970's.
 * @author Sean A. Irvine
 */
public class A096555 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A096555() {
    super(65539, 0, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
