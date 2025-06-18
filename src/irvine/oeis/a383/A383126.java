package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383126 allocated for Robin Jones.
 * @author Sean A. Irvine
 */
public class A383126 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383126() {
    super(281, 28411, 134456);
    //System.out.println("Period: " + computePeriod());
  }
}
