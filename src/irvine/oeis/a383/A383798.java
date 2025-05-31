package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383798 Consecutive states of the linear congruential pseudo-random number generator for SIMSCRIPT II when started at 1.
 * @author Sean A. Irvine
 */
public class A383798 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383798() {
    super(630360016, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
