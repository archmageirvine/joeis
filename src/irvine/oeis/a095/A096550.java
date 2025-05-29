package irvine.oeis.a095;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A096550 Consecutive internal states of the IMSL pseudo-random number generator RNUN when started with ISEED=1.
 * @author Sean A. Irvine
 */
public class A096550 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A096550() {
    super(16807, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
