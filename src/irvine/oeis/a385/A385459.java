package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385459 Consecutive internal states of the linear congruential pseudo-random number generator (3877*s + 29573) mod 139968 when started at 1.
 * @author Sean A. Irvine
 */
public class A385459 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385459() {
    super(3877, 29573, 139968);
  }
}
