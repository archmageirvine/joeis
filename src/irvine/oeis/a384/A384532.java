package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384532 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384532() {
    super(663608941, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
