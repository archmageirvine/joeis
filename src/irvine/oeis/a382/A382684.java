package irvine.oeis.a382;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A382684 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A382684 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A382684() {
    super(2147001325, 715136305, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
