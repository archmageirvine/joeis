package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384573 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A384573 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384573() {
    super(314159269, 1, (1L << 31) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
