package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384546 Consecutive states of the linear congruential pseudo-random number generator 1732073221*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384546 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384546() {
    super(1732073221, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
