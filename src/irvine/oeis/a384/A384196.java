package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384196 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384196() {
    super(20403, 0, 1L << 15);
    //System.out.println("Period: " + computePeriod());
  }
}
