package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384085 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384085() {
    super(40, 725, 729);
    //System.out.println("Period: " + computePeriod());
  }
}
