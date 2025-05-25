package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384316 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384316() {
    super(3125, 0, 1L << 26);
    //System.out.println("Period: " + computePeriod());
  }
}
