package irvine.oeis.a385;

import irvine.oeis.LinearCongruentialGenerator;

/**
 * A383940.
 * @author Sean A. Irvine
 */
public class A385002 extends LinearCongruentialGenerator {

  /** Construct the sequence. */
  public A385002() {
    super(211, 1663, 7875);
    //System.out.println("Period: " + computePeriod());
  }
}
