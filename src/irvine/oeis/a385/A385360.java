package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385360 Consecutive states of the linear congruential pseudo-random number generator (1861*s + 49297) mod 233280 when started at s=1.
 * @author Sean A. Irvine
 */
public class A385360 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385360() {
    super(1861, 49297, 233280);
  }
}
