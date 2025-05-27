package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384341 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384341() {
    super(31481, 21139, 100000);
    //System.out.println("Period: " + computePeriod());
  }
}
