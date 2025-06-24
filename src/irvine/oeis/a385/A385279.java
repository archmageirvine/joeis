package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385279 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385279() {
    super(625, 6571, 31104);
    //System.out.println("Period: " + computePeriod());
  }
}
