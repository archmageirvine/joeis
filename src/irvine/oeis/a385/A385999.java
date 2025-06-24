package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385999 extends LinearCongruentialGenerator {

  // todo this is a placeholder, not a true sequence

  /** Construct the sequence. */
  public A385999() {
    super(8121, 28411, 134456);
    System.out.println("Period: " + computePeriod());
  }
}
