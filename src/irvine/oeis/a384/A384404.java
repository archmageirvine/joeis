package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384404 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384404() {
    super(48271, 0, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
