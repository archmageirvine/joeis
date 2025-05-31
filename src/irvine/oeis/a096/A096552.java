package irvine.oeis.a096;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A096552 Consecutive internal states of the linear congruential pseudo-random number generator MTH$RANDOM that is used in the VAX VMS Library.
 * @author Sean A. Irvine
 */
public class A096552 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A096552() {
    super(69069, 1, 1L << 32, 0);
    //System.out.println("Period: " + computePeriod());
  }
}
