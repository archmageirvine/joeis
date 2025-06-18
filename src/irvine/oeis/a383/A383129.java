package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383129 allocated for Robin Jones.
 * @author Sean A. Irvine
 */
public class A383129 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383129() {
    super(421, 54773, 259200);
    //System.out.println("Period: " + computePeriod());
  }
}
