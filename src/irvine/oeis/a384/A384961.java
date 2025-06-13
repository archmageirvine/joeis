package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384961 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384961() {
    super(257, 41, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
