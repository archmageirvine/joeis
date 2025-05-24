package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384292 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384292() {
    super(214013, 13523655, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
