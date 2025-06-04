package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384569 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A384569 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384569() {
    super(3141592221L, 1, 10000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
