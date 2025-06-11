package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384863 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384863() {
    super(302875106592253L, 0, 1L << 59);
    //System.out.println("Period: " + computePeriod());
  }
}
