package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383127 Consecutive internal states of the linear congruential pseudo-random number generator (205*s + 29573) mod 139968 when started at 1.
 * @author Sean A. Irvine
 */
public class A383127 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383127() {
    super(205, 29573, 139968);
    //System.out.println("Period: " + computePeriod());
  }
}
