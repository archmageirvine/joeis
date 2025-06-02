package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384534 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384534() {
    super(1099087573, 0, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
