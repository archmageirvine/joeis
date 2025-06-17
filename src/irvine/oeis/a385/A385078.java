package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385078 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385078() {
    super(967, 3041, 14406);
    //System.out.println("Period: " + computePeriod());
  }
}
