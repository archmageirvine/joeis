package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384516 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384516() {
    super(410092949, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
