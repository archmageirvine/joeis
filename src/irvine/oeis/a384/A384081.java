package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384081 allocated for Leo Hennig.
 * @author Sean A. Irvine
 */
public class A384081 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384081() {
    super(997, 0, 10000000);
    //System.out.println("Period: " + computePeriod());
  }
}
