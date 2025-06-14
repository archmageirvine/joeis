package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384973 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384973() {
    super(101, 1, 1L << 13);
    //System.out.println("Period: " + computePeriod());
  }
}
