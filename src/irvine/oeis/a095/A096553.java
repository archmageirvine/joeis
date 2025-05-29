package irvine.oeis.a095;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A096553 Consecutive states of the linear congruential pseudo-random number generator used in function rand() in the Standard C library (VAX C) when started at 1.
 * @author Sean A. Irvine
 */
public class A096553 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A096553() {
    super(1103515245, 12345, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
