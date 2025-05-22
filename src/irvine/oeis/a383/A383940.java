package irvine.oeis.a383;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940 allocated for Antti Karttunen.
 * @author Sean A. Irvine
 */
public class A383940 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A383940() {
    super(25173, 13849, 1L << 16);
    //System.out.println("Period: " + computePeriod());
  }
}
