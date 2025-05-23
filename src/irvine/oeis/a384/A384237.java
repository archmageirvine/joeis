package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384237 extends LinearCongruentialGenerator {

  // todo not valid a-number

  /** Construct the sequence. */
  public A384237() {
    super(997, 0, 10000000);
    System.out.println("Period: " + computePeriod());
  }
}
