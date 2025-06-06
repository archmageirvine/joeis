package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384643 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384643() {
    super(30517578125L, 0, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
