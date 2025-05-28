package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384401 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384401() {
    super(40014, 0, (1L << 31) - 85);
    //System.out.println("Period: " + computePeriod());
  }
}
