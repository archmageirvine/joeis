package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384082 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384082() {
    super(61, 323, 500);
    //System.out.println("Period: " + computePeriod());
  }
}
