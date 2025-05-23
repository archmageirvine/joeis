package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384220 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384220() {
    super(25181, 13849, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
