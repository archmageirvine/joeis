package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384608 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384608() {
    super(129, 27098671125L, 1L << 35);
    //System.out.println("Period: " + computePeriod());
  }
}
