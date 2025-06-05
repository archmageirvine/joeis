package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384637 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384637() {
    super(1220703125, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
