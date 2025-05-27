package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384346 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384346() {
    super(4253261, 12896793, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
