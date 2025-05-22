package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384150 allocated for Lynn R. Purser.
 * @author Sean A. Irvine
 */
public class A384150 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384150() {
    super(10924, 11830, 32769);
    //System.out.println("Period: " + computePeriod());
  }
}
