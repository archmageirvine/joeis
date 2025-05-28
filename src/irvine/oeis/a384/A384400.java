package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384400 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384400() {
    super(40692, 0, (1L << 31) - 249);
    //System.out.println("Period: " + computePeriod());
  }
}
