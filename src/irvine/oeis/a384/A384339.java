package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384339 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384339() {
    super(62605, 113218009, 1L << 29);
    //System.out.println("Period: " + computePeriod());
  }
}
