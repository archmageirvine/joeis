package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384675 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384675() {
    super(96889010407L, 0, 100000000000L);
    //System.out.println("Period: " + computePeriod());
  }
}
