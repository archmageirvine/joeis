package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384315 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384315() {
    super(1L << 13, 0, (1L << 26) - 9317);
    //System.out.println("Period: " + computePeriod());
  }
}
