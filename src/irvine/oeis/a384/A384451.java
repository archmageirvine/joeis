package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384451 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A384451 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384451() {
    super(1664525, 1013904223, 1L << 32, 1);
    //System.out.println("Period: " + computePeriod());
  }
}
