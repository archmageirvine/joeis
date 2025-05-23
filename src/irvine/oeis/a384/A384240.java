package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384240 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384240() {
    super(2897, 1, 1L << 23);
    //System.out.println("Period: " + computePeriod());
  }
}
