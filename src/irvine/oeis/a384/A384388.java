package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384388 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384388() {
    super(48828125, 293183133, 1L << 30);
    //System.out.println("Period: " + computePeriod());
  }
}
