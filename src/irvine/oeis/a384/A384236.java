package irvine.oeis.a384;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A384236 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A384236() {
    super(9806, 1, (1L << 17) - 1);
    //System.out.println("Period: " + computePeriod());
  }
}
