package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384431 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384431() {
    super(430, 2531, 11979);
    //System.out.println("Period: " + computePeriod());
  }
}
