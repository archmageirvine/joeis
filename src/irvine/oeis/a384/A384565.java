package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384565 allocated for Ken Clements.
 * @author Sean A. Irvine
 */
public class A384565 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384565() {
    super(5, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
