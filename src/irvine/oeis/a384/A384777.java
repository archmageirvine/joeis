package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384777 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384777() {
    super(2851130928467L, 0, 1000000000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
