package irvine.oeis.a382;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A382535 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A382535 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A382535() {
    super(23, 0, 100000001);
    //System.out.println("Period: " + computePeriod());
  }
}
