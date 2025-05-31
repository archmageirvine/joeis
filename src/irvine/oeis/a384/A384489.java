package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384489 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384489() {
    super(392314069, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
