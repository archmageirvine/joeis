package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384237 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384237() {
    super(2897, 1, 1L << 23);
    System.out.println("Period: " + computePeriod());
  }
}
