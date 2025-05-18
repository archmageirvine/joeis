package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809 allocated for James C. McMahon.
 * @author Sean A. Irvine
 */
public class A383809 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383809() {
    super(17, 0, 251);
    //System.out.println("Period: " + computePeriod());
  }
}
