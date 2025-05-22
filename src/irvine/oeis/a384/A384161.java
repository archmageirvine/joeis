package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384161 allocated for Abhiram R Devesh.
 * @author Sean A. Irvine
 */
public class A384161 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384161() {
    super(259, 0, 1L << 15);
    //System.out.println("Period: " + computePeriod());
  }
}
