package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384373 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384373() {
    super(131075, 0, 1L << 27);
    //System.out.println("Period: " + computePeriod());
  }
}
