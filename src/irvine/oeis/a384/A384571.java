package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384571 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A384571 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384571() {
    super(4160984121L, 1, 10000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
