package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383128 allocated for Robin Jones.
 * @author Sean A. Irvine
 */
public class A383128 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383128() {
    super(321, 123, 100000);
    //System.out.println("Period: " + computePeriod());
  }
}
