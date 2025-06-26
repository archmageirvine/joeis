package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385336 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385336() {
    super(1541, 2957, 14000);
    //System.out.println("Period: " + computePeriod());
  }
}
