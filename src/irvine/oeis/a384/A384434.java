package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384434 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384434() {
    super(452807053, 0, 1L << 31);
    //System.out.println("Period: " + computePeriod());
  }
}
