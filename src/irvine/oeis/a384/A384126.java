package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384126 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384126() {
    super(93, 1, 8192);
    //System.out.println("Period: " + computePeriod());
  }
}
