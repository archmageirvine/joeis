package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384158 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384158() {
    super(253, 0, 32768);
    //System.out.println("Period: " + computePeriod());
  }
}
