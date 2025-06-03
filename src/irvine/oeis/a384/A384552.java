package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384552 Consecutive states of the linear congruential pseudo-random number generator 3934873077*s mod 2^32 when started at s=1.
 * @author Sean A. Irvine
 */
public class A384552 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384552() {
    super(3934873077L, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
