package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385335 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385335() {
    super(1741, 2731, 12960);
    //System.out.println("Period: " + computePeriod());
  }
}
