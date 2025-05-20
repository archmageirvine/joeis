package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809 Consecutive states of a linear congruential pseudo-random number generator for Lisp 1985 when started at 1.
 * @author Sean A. Irvine
 */
public class A383809 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383809() {
    super(17, 0, 251);
    //System.out.println("Period: " + computePeriod());
  }
}
