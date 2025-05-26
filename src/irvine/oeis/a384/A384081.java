package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384081 Consecutive internal states of a linear congruential pseudo-random number generator for the Hewlett-Packard HP-20S when started at 1.
 * @author Sean A. Irvine
 */
public class A384081 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384081() {
    super(997, 0, 10000000);
    //System.out.println("Period: " + computePeriod());
  }
}
