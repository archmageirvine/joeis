package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384615 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384615() {
    super(8404997, 1, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
