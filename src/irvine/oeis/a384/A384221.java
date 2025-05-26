package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384221 Consecutive states of the linear congruential pseudo-random number generator for the Texas Instruments TI99 when started at 1.
 * @author Sean A. Irvine
 */
public class A384221 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384221() {
    super(28645, 31417, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
