package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384406 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384406() {
    super(397204094, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
