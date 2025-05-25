package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384297 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384297() {
    super(16598013, 12820163, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
