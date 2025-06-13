package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384696 Consecutive states of the linear congruential pseudo-random number generator Cray RANF when started at 1.
 * @author Sean A. Irvine
 */
public class A384696 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384696() {
    super(44485709377909L, 0, 1L << 48);
    //System.out.println("Period: " + computePeriod());
  }
}
