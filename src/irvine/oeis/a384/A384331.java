package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384331 allocated for Paul Curtz.
 * @author Sean A. Irvine
 */
public class A384331 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384331() {
    super(214013, 2531011, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
