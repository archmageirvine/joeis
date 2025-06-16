package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999 allocated for Omar E. Pol.
 * @author Sean A. Irvine
 */
public class A384999 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384999() {
    super(171, 11213, 53125);
    System.out.println("Period: " + computePeriod());
  }
}
