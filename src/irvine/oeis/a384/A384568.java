package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384568 Consecutive states of the linear congruential pseudo-random number generator for the Hewlett Packard HP-11C when started at 1.
 * @author Sean A. Irvine
 */
public class A384568 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384568() {
    super(1574352261, 1017980433, 10000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
