package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A385003 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385003() {
    super(421, 1663, 7875);
    //System.out.println("Period: " + computePeriod());
  }
}
