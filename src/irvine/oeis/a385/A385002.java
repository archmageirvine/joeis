package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385002 Consecutive states of the linear congruential pseudo-random number generator (211*s + 1663) mod 7875 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385002 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385002() {
    super(211, 1663, 7875);
    //System.out.println("Period: " + computePeriod());
  }
}
