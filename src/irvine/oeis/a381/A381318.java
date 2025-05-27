package irvine.oeis.a381;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A381318 allocated for Anand Jain.
 * @author Sean A. Irvine
 */
public class A381318 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A381318() {
    super(48828125, 36643009, 1L << 30);
    //System.out.println("Period: " + computePeriod());
  }
}
