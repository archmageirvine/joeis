package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385999 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385999() {
    super(228, 0, 65537);
    System.out.println("Period: " + computePeriod());
  }
}
