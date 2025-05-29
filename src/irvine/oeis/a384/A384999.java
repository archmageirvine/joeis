package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384999 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384999() {
    super(1162261467, 0, 1L << 31);
    System.out.println("Period: " + computePeriod());
  }
}
