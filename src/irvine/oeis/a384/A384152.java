package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384152 Consecutive states of the linear congruential pseudo-random number generator used by OMNITAB II when started at 1.
 * @author Sean A. Irvine
 */
public class A384152 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384152() {
    super(125, 0, 8192);
    //System.out.println("Period: " + computePeriod());
  }
}
