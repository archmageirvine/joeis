package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384935 Consecutive states of the linear congruential pseudo-random number generator 513*s mod (2^31-1) when started at s=1.
 * @author Sean A. Irvine
 */
public class A384935 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384935() {
    super(513, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
