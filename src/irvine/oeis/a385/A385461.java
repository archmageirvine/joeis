package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383126.
 * @author Sean A. Irvine
 */
public class A385461 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385461() {
    super(8121, 28411, 134456);
    //System.out.println("Period: " + computePeriod());
  }
}
