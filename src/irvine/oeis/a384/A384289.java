package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384289 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384289() {
    super(214013, 2531011, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
