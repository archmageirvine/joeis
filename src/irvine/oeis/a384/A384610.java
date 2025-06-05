package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384610 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384610() {
    super(262145, 3, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
