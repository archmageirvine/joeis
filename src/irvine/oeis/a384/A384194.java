package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384194 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384194() {
    super(259, 0, 1L << 15);
    //System.out.println("Period: " + computePeriod());
  }
}
