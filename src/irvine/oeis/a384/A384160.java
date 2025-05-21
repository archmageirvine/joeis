package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384160 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384160() {
    super(131069, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
