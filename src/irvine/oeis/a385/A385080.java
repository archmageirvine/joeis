package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A384999.
 * @author Sean A. Irvine
 */
public class A385080 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385080() {
    super(237, 0, 65537);
    //System.out.println("Period: " + computePeriod());
  }
}
