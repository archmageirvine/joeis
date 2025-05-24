package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384291 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384291() {
    super(214013, 13737667, 1L << 24);
    //System.out.println("Period: " + computePeriod());
  }
}
