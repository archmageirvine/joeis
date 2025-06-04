package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384999 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384999() {
    super(3141592621L, 1, 10000000000L);
    System.out.println("Period: " + computePeriod());
  }
}
