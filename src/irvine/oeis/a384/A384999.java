package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384999 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384999() {
    super(25214903917L, 11, 1L << 48);
    //System.out.println("Period: " + computePeriod());
  }
}
