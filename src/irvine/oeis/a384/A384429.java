package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384429 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384429() {
    super(16807, 0, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
