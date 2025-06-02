package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384535 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384535() {
    super(1566083941, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
