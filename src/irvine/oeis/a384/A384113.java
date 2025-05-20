package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384113 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384113() {
    super(13, 0, 2311);
    //System.out.println("Period: " + computePeriod());
  }
}
