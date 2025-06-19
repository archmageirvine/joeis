package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385127 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385127() {
    super(69069, 5, 1L << 32);
    //System.out.println("Period: " + computePeriod());
  }
}
