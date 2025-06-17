package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A385036 allocated for Alexander Yutkin.
 * @author Sean A. Irvine
 */
public class A385036 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385036() {
    super(419, 6173, 29282);
    //System.out.println("Period: " + computePeriod());
  }
}
