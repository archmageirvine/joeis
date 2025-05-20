package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383809.
 * @author Sean A. Irvine
 */
public class A384114 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384114() {
    super(125, 1, 4096);
    //System.out.println("Period: " + computePeriod());
  }
}
